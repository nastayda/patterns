package factory.abstractFactory;

public enum HeroType {
  KING("King"),
  KNIGHT("Knight");

  private String name;

  HeroType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
