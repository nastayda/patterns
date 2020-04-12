package factory.method;

import java.util.List;

abstract public class Character {
  private String name;
  private int level;
  private int speed;
  private int force;
  private int health;
  private List<String> artifacts;

  public Character(String name, int level, int speed, int force, int health, List<String> artifacts) {
    this.name = name;
    this.level = level;
    this.speed = speed;
    this.force = force;
    this.health = health;
    this.artifacts = artifacts;
  }

  public void name() {
    System.out.println("Hero: " + name);
  }

  public void level() {
    System.out.println("Level: " + level);
  }

  public void move() {
    System.out.println("Move with speed: " + speed);
  }

  public void fight() {
    System.out.println("Fight with force: " + force);
  }

  public void currentHealth() {
    System.out.println("Current health: " + health);
  }

  public void addToDb() {
    System.out.println(String.format("Add %s to data base", name));
  }

  public String toString() {
    StringBuilder display = new StringBuilder();
    display.append("---- " + name + " ----\n")
        .append(speed + "\n")
        .append(force + "\n");
    for (String artifact : artifacts) {
      display.append(artifact + "\n");
    }
    return display.toString();
  }
}
