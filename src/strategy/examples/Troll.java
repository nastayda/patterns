package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Snail;
import strategy.behavior.weapon.AxeBehavior;

public class Troll extends Character {
  public Troll() {
    weapon = new AxeBehavior();
    speed = new Snail();
  }

  @Override
  public void fight() {
    System.out.println("Troll is fighting");
  }

  @Override
  protected void move() {
    System.out.println("Troll is moving");
  }
}
