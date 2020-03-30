package factory.method;

import factory.simple.CharactersType;

public abstract class HeroCreation {

  public Character create(CharactersType type) {
    Character character;
    character = createCharacter(type);

    character.name();
    character.level();
    character.move();
    character.fight();
    character.currentHealth();
    character.addToDb();

    return character;
  }

  public abstract Character createCharacter(CharactersType type);
}
