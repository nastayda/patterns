package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Rapid;
import strategy.behavior.weapon.SwordBehavior;

public class Knight extends Character {
  public Knight() {
    weapon = new SwordBehavior();
    speed = new Rapid();
  }

  @Override
  public void fight() {
    System.out.println("Knight is fighting");
  }

  @Override
  protected void move() {
    System.out.println("Knight is moving");
  }
}
