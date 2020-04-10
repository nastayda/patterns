package factory.simple;

public class HeroFactory {
  public Character createCharacter(CharactersType type) {
    switch (type) {
      case KING:
        return new King();
      case KNIGHT:
        return new Knight();
      default:
        return null;
    }
  }
}
