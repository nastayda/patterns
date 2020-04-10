package factory.simple;

public class HeroCreation {
  private HeroFactory heroFactory;

  public HeroCreation(HeroFactory heroFactory) {
    this.heroFactory = heroFactory;
  }

  public Character create(CharactersType type) {
    Character character;
    character = heroFactory.createCharacter(type);

    character.name();
    character.currentHealth();

    return character;
  }
}
