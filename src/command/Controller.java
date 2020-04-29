package command;

public class Controller {
  Command command;

  public Controller() {
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }
}
