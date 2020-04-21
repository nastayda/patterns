package factory.simple;

public enum CharactersEnum {
  KING("King"),
  KNIGHT("Knight");

  private String name;

  CharactersEnum(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
