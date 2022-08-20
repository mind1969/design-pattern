package command;

/**
 * 命令接口
 *
 * @author mind1969
 * @version 1.0
 * @version 2.0 加上撤回方法
 * @date 2022/08/03 23:33
 */
public interface Command {

    public void execute();

    public void undo();

}
