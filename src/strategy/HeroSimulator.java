package strategy;

import strategy.examples.Knight;
import strategy.examples.Troll;

public class HeroSimulator {
  public static void main(String[] args){
    Character knight = new Knight();
    knight.fight();
    knight.performWeapon();
    knight.move();
    knight.performSpeed();

    Character troll = new Troll();
    troll.fight();
    troll.performWeapon();
    troll.move();
    troll.performSpeed();
  }
}
