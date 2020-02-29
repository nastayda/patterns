package strategy.behavior.speed;

public class Rapid implements SpeedBehavior {
  @Override
  public void move() {
    System.out.println("Move rapidly");
  }
}
