package factory.abstractFactory.levelFactory;

import factory.abstractFactory.characteristics.force.Force;
import factory.abstractFactory.characteristics.health.Health;
import factory.abstractFactory.characteristics.speed.Speed;
import factory.abstractFactory.characteristics.weapon.Weapon;

public interface LevelFactory {
  Weapon createWeapon();

  Speed createSpeed();

  Force createForce();

  Health createHealth();
}
