package factory.abstractFactory.hero;

import factory.abstractFactory.characteristics.force.Force;
import factory.abstractFactory.characteristics.health.Health;
import factory.abstractFactory.characteristics.speed.Speed;
import factory.abstractFactory.characteristics.weapon.Weapon;
import factory.abstractFactory.levelFactory.LevelFactory;

public abstract class Hero {
  protected String name;
  protected Force force;
  protected Health health;
  protected Speed speed;
  protected Weapon weapon;

  protected LevelFactory levelFactory;

  public void setName(String name) {
    this.name = name;
  }

  public void setCharacteristics() {
    System.out.println("Hero: " + name);
    force = levelFactory.createForce();
    health = levelFactory.createHealth();
    speed = levelFactory.createSpeed();
    weapon = levelFactory.createWeapon();
  }

  public String heroInfo() {
    return "---- " + name + " ----\n" +
        speed + "\n" +
        force + "\n" +
        health + "\n" +
        weapon + "";
  }
}
