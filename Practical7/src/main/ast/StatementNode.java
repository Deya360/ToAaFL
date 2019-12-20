package main.ast;


import java.util.List;

public class StatementNode extends CommandNode {
    public List<CommandNode> cmds;
    public ConditionNode cond;

    public StatementNode(List<CommandNode> cmds, ConditionNode cond) {
        this.cmds = cmds;
        this.cond = cond;
    }
}
