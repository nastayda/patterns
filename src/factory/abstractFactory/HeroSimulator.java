package factory.abstractFactory;

import factory.abstractFactory.creators.FirstLevelCreator;
import factory.abstractFactory.creators.HeroCreator;
import factory.abstractFactory.creators.HeroFactory;
import factory.abstractFactory.hero.Hero;
import factory.abstractFactory.levelFactory.SecondLevelFactory;

public class HeroSimulator {

  public static void main(String[] args) {
    HeroCreator heroLevel1 = new FirstLevelCreator();

    Hero king1 = heroLevel1.create(HeroType.KING);
    System.out.println(king1.heroInfo());

    //using factory
    HeroFactory heroLevel = new HeroFactory(new SecondLevelFactory());
    Hero king2 = heroLevel.createNew(HeroType.KING);
    System.out.println(king2.heroInfo());
  }
}
