package patterns.strategy.examples;

import patterns.strategy.Character;
import patterns.strategy.behavior.speed.Rapid;
import patterns.strategy.behavior.weapon.SwordBehavior;

public class Knight extends Character {
  public Knight() {
    super(new SwordBehavior(), new Rapid());
  }

}
