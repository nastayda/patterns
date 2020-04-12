package factory.method.creatiors;

import factory.method.Character;
import factory.method.HeroCreation;
import factory.method.heros.KingLevelOne;
import factory.method.heros.KnightLevelOne;
import factory.simple.CharactersType;

public class HeroLevelOneCreator extends HeroCreation {

  @Override
  public Character createCharacter(CharactersType type) {
    switch (type) {
      case KING:
        return new KingLevelOne();
      case KNIGHT:
        return new KnightLevelOne();
      default:
        throw new RuntimeException("There is no hero");
    }
  }
}
