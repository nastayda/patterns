package factory.simple;

public class Knight extends Character {
  public Knight() {
    name = "Knight";
    speed = 10;
    force = 10;
    health = 8;
    artifacts.add("Sword");
    artifacts.add("Arrow");
  }
}
