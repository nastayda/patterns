package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Snail;
import strategy.behavior.weapon.KnifeBehavior;

public class Queen extends Character {
  public Queen() {
    weapon = new KnifeBehavior();
    speed = new Snail();
  }

  @Override
  public void fight() {
    System.out.println("Queen is fighting");
  }

  @Override
  protected void move() {
    System.out.println("Queen is moving");
  }
}
