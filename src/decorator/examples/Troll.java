package decorator.examples;

import decorator.Character;
import decorator.behavior.speed.Snail;
import decorator.behavior.weapon.AxeBehavior;

public class Troll extends Character {
  public Troll() {
    super(new AxeBehavior(), new Snail());
  }

  @Override
  public int fightForce() {
    return 10;
  }
}
