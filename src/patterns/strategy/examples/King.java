package patterns.strategy.examples;

import patterns.strategy.Character;
import patterns.strategy.behavior.speed.Slow;
import patterns.strategy.behavior.weapon.SwordBehavior;

public class King extends Character {
  public King() {
    super(new SwordBehavior(), new Slow());
  }
}
