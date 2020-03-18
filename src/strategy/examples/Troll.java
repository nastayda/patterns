package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Snail;
import strategy.behavior.weapon.AxeBehavior;

public class Troll extends Character {
  public Troll() {
    super(new AxeBehavior(), new Snail());
  }
}
