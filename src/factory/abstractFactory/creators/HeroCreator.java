package factory.abstractFactory.creators;

import factory.abstractFactory.HeroType;
import factory.abstractFactory.hero.Hero;

public abstract class HeroCreator {
  protected abstract Hero chooseHero(HeroType name);

  public Hero create(HeroType name) {
    Hero hero = chooseHero(name);
    hero.setCharacteristics();
    return hero;
  }
}
