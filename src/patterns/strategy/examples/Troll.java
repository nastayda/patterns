package patterns.strategy.examples;

import patterns.strategy.Character;
import patterns.strategy.behavior.speed.Snail;
import patterns.strategy.behavior.weapon.AxeBehavior;

public class Troll extends Character {
  public Troll() {
    super(new AxeBehavior(), new Snail());
  }
}
