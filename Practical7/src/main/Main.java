package main;

import main.ast.*;
import main.ast.expr.ExprIdNode;
import main.ast.expr.ExprNode;
import main.ast.expr.ExprNorNode;
import main.ast.idgrp.*;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static  HashMap<String, Integer> variables = new HashMap<>();

    private static StatementNode convertStatment(ExprParser.StatmentContext c) {
        List<CommandNode> cmds = new ArrayList<>();
        for (int i = 0; i < c.cmd.size(); i ++) {
            cmds.add(convertCmd(c.cmd.get(i)));
        }
        ConditionNode cond = convertCond(c.cond);
        return new StatementNode(cmds, cond);
    }

    private static CommandNode convertCmd(ExprParser.CommandContext cmd) {
        if (cmd.expr()!=null) {
            return convertExpr(cmd.expr());
        } else if (cmd.mprint()!=null) {
            return convertPrint(cmd.mprint());
        } else if (cmd.assign()!=null) {
//            return convertAssign(cmd.assign());
        } else if (cmd.statment()!=null) {
            return convertStatment(cmd.statment());
        }
        throw new RuntimeException("convertCmd: invalid expr");
    }

    private static PrintNode convertPrint(ExprParser.MprintContext pr) {
        return new PrintNode(convertExpr(pr.expr()));
    }

    private static ConditionNode convertCond(ExprParser.ConditionContext cond) {
        return new ConditionNode(convertExpr(cond.l), convertExpr(cond.r), new CmpNode(cond.co));
    }

    private static ExprNode convertExpr(ExprParser.ExprContext c) {
        if (c.exprnor()!=null) {
            return convertExprNor(c.exprnor());
        } else if (c.exprid()!=null) {
            return convertExprId(c.exprid());
        } else if (c.idgrp()!=null) {
            return convertIdGrp(c.idgrp());
        } else if (c.l!=null && c.r!=null && c.op!=null) {
            return new ExprNode(convertExpr(c.l), convertExpr(c.r), new OperNode(c.op));
        }
        throw new RuntimeException("convertExpr: invalid token");
    }

    private static ExprNorNode convertExprNor(ExprParser.ExprnorContext c) {
//        IDGrpNode left = convertIdGrp(c.l);
//        for (int i = 0; i < c.r.size(); i++) {
//            IDGrpNode right = convertIdGrp(c.r.get(i));
//            Token op = new OperNode(c.op.get(i)).token;
//            left = new IDGrpNode()
//        }
//        return new ExprNorNode(left, convertIdGrp(c.l), c.op);
        return new ExprNorNode(convertIdGrp(c.l), convertIdGrp(c.r), new OperNode(c.op));
    }

    private static ExprNode convertExprId(ExprParser.ExpridContext ei) {
        return new ExprIdNode(new IDNode(ei.id), convertIdGrp(ei.r), new OperNode(ei.op));
    }

    private static IDGrpNode convertIdGrp(ExprParser.IdgrpContext l) {
        if (l.i!=null) {
            return new IDNode(l.i);
        } else if (l.n!=null) {
            return convertNum(l.n);
        }
        throw new RuntimeException("convertIdGrp: invalid num/id");
    }

    private static IDGrpNode convertNum(ExprParser.NumbergrpContext n) {
        if (n.NUM()!=null) {
            return new NumDecNode(n.NUM().getSymbol());

        } else if (n.roman()!=null) {
            return new NumRomanNode(n.roman());
        }
        throw new RuntimeException("convertNum: invalid num");
    }



//    ExprNode left = convertSlag(c.left);
//        for (int i = 0; i < c.right.size(); i++) {
//        ExprNode right = convertSlag(c.right.get(i));
//        Token op = c.op.get(i);
//        left = new BinOpNode(op, left, right);
//    }
//
//    private static ExprNode convertSlag(ExprParser.SlagContext c) {
//        ExprNode left = convertMnozh(c.left);
//        for (int i = 0; i < c.right.size(); i++) {
//            ExprNode right = convertMnozh(c.right.get(i));
//            Token op = c.op.get(i);
//            left = new BinOpNode(op, left, right);
//        }
//        return left;
//    }
//
//    private static ExprNode convertMnozh(ExprParser.MnozhContext c) {
//        if (c.ID() != null) {
//            return new NumberNode(c.NUMBER().getSymbol());
//
//        } else if (c.NUMBER() != null) {
//            return new NumberNode(c.NUMBER().getSymbol());
//        } else {
//            return convertExpr(c.expr());
//        }
//    }




    private static void eval(StatementNode node) {
        List<CommandNode> commands = node.cmds;
        ConditionNode condition = node.cond;

        do {
            for (CommandNode command : commands) {
                preformCommand(command);
            }
        } while (condIsTrue(condition));
    }

    private static boolean condIsTrue(ConditionNode condition) {
        int l = evalExpr(condition.l);
        int r = evalExpr(condition.r);
        return cmpExpr(l, r, condition.co);
    }

    private static int evalExpr(ExprNode c) {
        if (c instanceof ExprIdNode) {
            int right = getIdGrp(((ExprIdNode) c).r);
            int left = getSetId(((ExprIdNode) c).l, right, ((ExprIdNode) c).op);
            return opExpr(left, right, ((ExprIdNode) c).op);

        } else if (c instanceof ExprNorNode) {
            int left = getIdGrp(((ExprNorNode) c).l);
            int right = getIdGrp(((ExprNorNode) c).r);
            return opExpr(left, right, ((ExprNorNode) c).op);

        } else if (c instanceof IDGrpNode) {
            return getIdGrp((IDGrpNode) c);

        } else {
            int left = evalExpr(c.l);
            int right = evalExpr(c.r);

            if (c.op !=null) {
                return opExpr(left, right, c.op);
            }
        }
        throw new RuntimeException("evalExpr: invalid expr type");
    }

    private static int opExpr(int l, int r, OperNode op) {
        switch (op.token.getType()) {
            case ExprParser.ADD: return  l+r;
            case ExprParser.SUB: return  l-r;
            case ExprParser.MUL: return  l*r;
            case ExprParser.DIV: return  l/r;
        }
        throw new RuntimeException("cmpExpr: invalid comp type");
    }

    private static boolean cmpExpr(int l, int r, CmpNode co) {
        switch (co.token.getType()) {
                case ExprParser.LTHAN: return  l<r;
                case ExprParser.GTHAN: return  l>r;
                case ExprParser.LTHANEQU: return  l<=r;
                case ExprParser.GTHANEQU: return  l>=r;
                case ExprParser.ISEQUAL: return  l==r;
            }
        throw new RuntimeException("cmpExpr: invalid comp type");
    }

    private static int getIdGrp(IDGrpNode idGrpNode) {
        if (idGrpNode instanceof IDNode) {
            String variable = ((IDNode) idGrpNode).token.getText();
            if (variables.containsKey(variable)) {
                return variables.get(variable);
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input the value of " + variable + ": ");
                int val = sc.nextInt();
                variables.put(variable, val);
                return val;
            }

        } else if (idGrpNode instanceof NumDecNode) {
            return ((NumDecNode) idGrpNode).number;

        } else if (idGrpNode instanceof NumRomanNode) {
            return ((NumRomanNode) idGrpNode).number;
        }

        throw new RuntimeException("getIdGrp: invalid idgrp");
    }

    private static int getSetId(IDNode l, int right, OperNode op) {
        String variable = (l.token.getText());
        if (variables.containsKey(variable)) {
            int oldVal = variables.get(variable);

            int newVal = opExpr(oldVal, right, op);
            variables.put(variable, newVal);

            return newVal;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please input the value of " + variable + ": ");
            int val = sc.nextInt();

            int newVal = opExpr(val, right, op);
            variables.put(variable, newVal);

            return val;
        }

    }

    private static void preformCommand(CommandNode command) {
        if (command instanceof ExprNode) {
            evalExpr((ExprNode) command);
        } else if (command instanceof  StatementNode) {
            eval((StatementNode) command);
        } else if (command instanceof PrintNode) {
            System.out.println(String.valueOf(evalExpr(((PrintNode) command).expr)));
        } else {
            throw new RuntimeException("preformCommand: invalid command");
        }
    }

    public static void main(String[] args) {
        String text = "DO x+3 - 42; print x; WHILE XXXIX*0 + 6/2 + 54 - x > 43 ;";
        ExprLexer lex = new ExprLexer(CharStreams.fromString(text));
        ExprParser parser = new ExprParser(new CommonTokenStream(lex));
        parser.addErrorListener(new ConsoleErrorListener());
        parser.setErrorHandler(new BailErrorStrategy());
        ExprParser.StatmentContext c = parser.statment();
        StatementNode ast = convertStatment(c);
        eval(ast);
    }

}
