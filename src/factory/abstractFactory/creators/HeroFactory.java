package factory.abstractFactory.creators;

import factory.abstractFactory.HeroType;
import factory.abstractFactory.hero.Hero;
import factory.abstractFactory.hero.King;
import factory.abstractFactory.levelFactory.LevelFactory;

public class HeroFactory {
  private final LevelFactory levelFactory;

  public HeroFactory(LevelFactory levelFactory) {
    this.levelFactory = levelFactory;
  }

  public Hero createNew(HeroType name) {
    Hero hero = chooseHeroNew(name);
    hero.setCharacteristics();
    return hero;
  }

  public Hero chooseHeroNew(HeroType name) {
    Hero hero = null;

    if (name.equals(HeroType.KING)) {
      hero = new King(levelFactory);
      hero.setName(HeroType.KING.getName());
    } else if (name.equals(HeroType.KNIGHT)) {
      hero = new King(levelFactory);
      hero.setName(HeroType.KNIGHT.getName());
    }
    return hero;
  }
}
