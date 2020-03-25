package decorator.examples;

import decorator.Character;
import decorator.behavior.speed.Snail;
import decorator.behavior.weapon.KnifeBehavior;

public class Queen extends Character {
  public Queen() {
    super(new KnifeBehavior(), new Snail());
  }

  @Override
  public int fightForce() {
    return 3;
  }
}
