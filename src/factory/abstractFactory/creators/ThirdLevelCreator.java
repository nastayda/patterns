package factory.abstractFactory.creators;

import factory.abstractFactory.HeroType;
import factory.abstractFactory.hero.Hero;
import factory.abstractFactory.hero.King;
import factory.abstractFactory.levelFactory.LevelFactory;
import factory.abstractFactory.levelFactory.ThirdLevelFactory;

public class ThirdLevelCreator extends HeroCreator {

  @Override
  public Hero chooseHero(HeroType name) {
    Hero hero = null;
    LevelFactory levelFactory = new ThirdLevelFactory();

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
