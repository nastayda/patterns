package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Slow;
import strategy.behavior.weapon.SwordBehavior;

public class King extends Character {
  public King() {
    weapon = new SwordBehavior();
    speed = new Slow();
  }

  @Override
  public void fight() {
    System.out.println("King is fighting");
  }

  @Override
  protected void move() {
    System.out.println("King is moving");
  }
}
