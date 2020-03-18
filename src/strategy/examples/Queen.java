package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Snail;
import strategy.behavior.weapon.KnifeBehavior;

public class Queen extends Character {
  public Queen() {
    super(new KnifeBehavior(), new Snail());
  }
}
