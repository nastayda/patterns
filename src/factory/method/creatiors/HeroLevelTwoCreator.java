package factory.method.creatiors;

import factory.method.Character;
import factory.method.heros.KingLevelTwo;
import factory.method.heros.KnightLevelTwo;
import factory.method.HeroCreation;
import factory.simple.CharactersType;

public class HeroLevelTwoCreator extends HeroCreation {
  @Override
  public Character createCharacter(CharactersType type) {
    switch (type) {
      case KING:
        return new KingLevelTwo();
      case KNIGHT:
        return new KnightLevelTwo();
      default:
        throw new RuntimeException("There is no hero");
    }
  }
}
