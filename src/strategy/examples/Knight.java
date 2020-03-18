package strategy.examples;

import strategy.Character;
import strategy.behavior.speed.Rapid;
import strategy.behavior.weapon.SwordBehavior;

public class Knight extends Character {
  public Knight() {
    super(new SwordBehavior(), new Rapid());
  }

}
