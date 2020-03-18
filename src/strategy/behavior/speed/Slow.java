package strategy.behavior.speed;

public class Slow implements SpeedBehavior {
  @Override
  public void move() {
    System.out.println("Move slowly but faster than snail");
  }
}
