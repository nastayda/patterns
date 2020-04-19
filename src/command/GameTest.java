package command;

public class GameTest {
  public static void main(String[] args) {
    Controller gameExecutor = new Controller();

    Dragon dragon = new Dragon();

    Princess princess = new Princess();

    gameExecutor.setCommand(dragon::step);
    gameExecutor.executeCommand();

    gameExecutor.setCommand(princess::jump);
    gameExecutor.executeCommand();

    gameExecutor.setCommand(() -> {
      dragon.flame();
      dragon.step();
    });
    gameExecutor.executeCommand();

    gameExecutor.setCommand(() -> {
      princess.jump();
      princess.invisible();
      princess.stab();
    });
    gameExecutor.executeCommand();

    gameExecutor.setCommand(() -> {
      dragon.step();
      dragon.fly();
    });
    gameExecutor.executeCommand();
  }
}
