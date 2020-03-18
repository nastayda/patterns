package decorator.behavior.artifact;

import decorator.Character;

public class ArtifactIncreaseForce extends CondimentDecoratorArtifact {

  private static final int INCREASE_COUNT = 1;

  @Override
  public int fightForce() {
    return INCREASE_COUNT + character.fightForce();
  }

  public ArtifactIncreaseForce(Character character) {
    super(character);
  }

  @Override
  public String getDescription() {
    return character.getDescription() + " -> increase force " + INCREASE_COUNT;
  }
}
