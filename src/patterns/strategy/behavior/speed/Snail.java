package patterns.strategy.behavior.speed;

public class Snail implements SpeedBehavior {
  @Override
  public void move() {
    System.out.println("Move like a snail");
  }
}
