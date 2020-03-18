package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Slow;
import strategy.behavior.weapon.SwordBehavior;

public class King extends Character {
  public King() {
    super(new SwordBehavior(), new Slow());
  }
}
