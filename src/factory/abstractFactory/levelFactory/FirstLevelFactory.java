package factory.abstractFactory.levelFactory;

import factory.abstractFactory.characteristics.force.Force;
import factory.abstractFactory.characteristics.force.TrickyForce;
import factory.abstractFactory.characteristics.health.Health;
import factory.abstractFactory.characteristics.health.InjuredHealth;
import factory.abstractFactory.characteristics.speed.SlowSpeed;
import factory.abstractFactory.characteristics.speed.Speed;
import factory.abstractFactory.characteristics.weapon.SwordWeapon;
import factory.abstractFactory.characteristics.weapon.Weapon;

public class FirstLevelFactory implements LevelFactory {
  @Override
  public Weapon createWeapon() {
    return new SwordWeapon();
  }

  @Override
  public Speed createSpeed() {
    return new SlowSpeed();
  }

  @Override
  public Force createForce() {
    return new TrickyForce();
  }

  @Override
  public Health createHealth() {
    return new InjuredHealth();
  }
}
