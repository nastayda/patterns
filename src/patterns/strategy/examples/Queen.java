package patterns.strategy.examples;

import patterns.strategy.Character;
import patterns.strategy.behavior.speed.Snail;
import patterns.strategy.behavior.weapon.KnifeBehavior;

public class Queen extends Character {
  public Queen() {
    super(new KnifeBehavior(), new Snail());
  }
}
