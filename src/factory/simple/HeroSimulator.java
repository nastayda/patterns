package factory.simple;

public class HeroSimulator {
  public static void main(String[] args) {
    HeroFactory factory = new HeroFactory();
    HeroCreation creation = new HeroCreation(factory);

    Character king = creation.create(CharactersType.KING);
    king.move();
    king.fight();

    Character knight = creation.create(CharactersType.KNIGHT);
    knight.move();
    knight.fight();
  }
}
