package factory.simple;

import java.util.ArrayList;
import java.util.List;

abstract public class Character {
  protected String name;
  protected int speed;
  protected int force;
  protected int health;
  protected List<String> artifacts = new ArrayList<>();

  public void name() {
    System.out.println("Hero: " + name);
  }

  public void move() {
    System.out.println("Move with speed: " + speed);
  }

  public void fight() {
    System.out.println("Fight with force: " + force);
  }

  public void currentHealth() {
    System.out.println("Current health: " + health);
  }
}
