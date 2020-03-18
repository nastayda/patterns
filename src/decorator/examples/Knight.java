package decorator.examples;

import decorator.Character;
import decorator.behavior.speed.Rapid;
import decorator.behavior.weapon.SwordBehavior;

public class Knight extends Character {
  public Knight() {
    super(new SwordBehavior(), new Rapid());
  }

  @Override
  public int fightForce() {
    return 10;
  }

}
