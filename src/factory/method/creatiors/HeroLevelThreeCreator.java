package factory.method.creatiors;

import factory.method.Character;
import factory.method.HeroCreation;
import factory.method.heros.KingLevelThree;
import factory.method.heros.KnightLevelThree;
import factory.simple.CharactersType;

public class HeroLevelThreeCreator extends HeroCreation {
  @Override
  public Character createCharacter(CharactersType type) {
    switch (type) {
      case KING:
        return new KingLevelThree();
      case KNIGHT:
        return new KnightLevelThree();
      default:
        throw new RuntimeException("There is no hero");
    }
  }
}
