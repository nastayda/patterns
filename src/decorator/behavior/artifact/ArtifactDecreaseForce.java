package decorator.behavior.artifact;

import decorator.Character;

public class ArtifactDecreaseForce extends CondimentDecoratorArtifact  {

  private static final int DECREASE_COUNT = -4;

  @Override
  public String getDescription() {
    return character.getDescription() + " -> decrease force " + DECREASE_COUNT;
  }

  public ArtifactDecreaseForce(Character character) {
    super(character);
  }

  @Override
  public int fightForce() {
    return DECREASE_COUNT + character.fightForce();
  }
}
