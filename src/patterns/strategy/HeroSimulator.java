package patterns.strategy;

import patterns.strategy.examples.Knight;
import patterns.strategy.examples.Troll;

public class HeroSimulator {
  public static void main(String[] args){
    Character knight = new Knight();
    knight.performWeapon();
    knight.performSpeed();

    Character troll = new Troll();
    troll.performWeapon();
    troll.performSpeed();
  }
}
