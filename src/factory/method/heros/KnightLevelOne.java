package factory.method.heros;

import factory.method.Character;
import java.util.Arrays;

public class KnightLevelOne extends Character {
  public KnightLevelOne() {
    super("Knight", 1, 10, 10, 8, Arrays.asList("Sword", "Arrows"));
  }
}
