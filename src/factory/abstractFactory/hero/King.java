package factory.abstractFactory.hero;

import factory.abstractFactory.levelFactory.LevelFactory;

public class King extends Hero {

  public King(LevelFactory levelFactory) {
    this.levelFactory = levelFactory;
  }
}
