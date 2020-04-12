package factory.method;

import factory.method.creatiors.HeroLevelOneCreator;
import factory.method.creatiors.HeroLevelThreeCreator;
import factory.method.creatiors.HeroLevelTwoCreator;
import factory.simple.CharactersType;

public class HeroSimulator {

  public static void main(String[] args) {
    HeroCreation heroLevel1 = new HeroLevelOneCreator();
    HeroCreation heroLevel2 = new HeroLevelTwoCreator();
    HeroCreation heroLevel3 = new HeroLevelThreeCreator();

    Character king1 = heroLevel1.create(CharactersType.KING);

    Character knight2 = heroLevel2.create(CharactersType.KNIGHT);

    Character king3 = heroLevel3.create(CharactersType.KING);
  }
}
