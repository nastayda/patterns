package decorator.examples;

import decorator.Character;
import decorator.behavior.speed.Slow;
import decorator.behavior.weapon.SwordBehavior;

public class King extends Character {
  public King() {
    super(new SwordBehavior(), new Slow());
    description = "King, force: " + fightForce();
  }

  @Override
  public int fightForce() {
    return 5;
  }
}
