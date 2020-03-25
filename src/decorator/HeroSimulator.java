package decorator;

import decorator.behavior.artifact.ArtifactDecreaseForce;
import decorator.behavior.artifact.ArtifactIncreaseForce;
import decorator.examples.King;

public class HeroSimulator {
  public static void main(String[] args){
//    Character knight = new Knight();
//    knight.performWeapon();
//    knight.performSpeed();
//
//    Character troll = new Troll();
//    troll.performWeapon();
//    troll.performSpeed();

    Character character = new King();
    character = new ArtifactIncreaseForce(character);
    character = new ArtifactDecreaseForce(character);
    System.out.println(String.format("Hero: %s, Force: %s", character.getDescription(), character.fightForce()));
  }
}
