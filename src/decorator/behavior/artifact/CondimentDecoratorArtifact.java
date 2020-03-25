package decorator.behavior.artifact;

import decorator.Character;

public abstract class CondimentDecoratorArtifact extends Character {

  protected Character character;

  CondimentDecoratorArtifact(Character character) {
    this.character = character;
  }

  public abstract String getDescription();
}
