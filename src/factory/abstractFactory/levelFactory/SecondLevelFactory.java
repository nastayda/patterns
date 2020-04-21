package factory.abstractFactory.levelFactory;

import factory.abstractFactory.characteristics.force.Force;
import factory.abstractFactory.characteristics.force.TrickyForce;
import factory.abstractFactory.characteristics.health.GoodHealth;
import factory.abstractFactory.characteristics.health.Health;
import factory.abstractFactory.characteristics.speed.FastSpeed;
import factory.abstractFactory.characteristics.speed.Speed;
import factory.abstractFactory.characteristics.weapon.GunWeapon;
import factory.abstractFactory.characteristics.weapon.Weapon;

public class SecondLevelFactory implements LevelFactory {
  @Override
  public Weapon createWeapon() {
    return new GunWeapon();
  }

  @Override
  public Speed createSpeed() {
    return new FastSpeed();
  }

  @Override
  public Force createForce() {
    return new TrickyForce();
  }

  @Override
  public Health createHealth() {
    return new GoodHealth();
  }
}
