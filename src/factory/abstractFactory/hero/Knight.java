package factory.abstractFactory.hero;

import factory.abstractFactory.levelFactory.LevelFactory;

public class Knight extends Hero {

  public Knight(LevelFactory levelFactory) {
    this.levelFactory = levelFactory;
  }
}
