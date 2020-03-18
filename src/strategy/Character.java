package strategy;

import strategy.behavior.speed.SpeedBehavior;
import strategy.behavior.weapon.WeaponBehavior;

public abstract class Character {
  private WeaponBehavior weapon;
  private SpeedBehavior speed;

  public Character(WeaponBehavior weapon, SpeedBehavior speed) {
    this.weapon = weapon;
    this.speed = speed;
  }

  public void setWeapon(WeaponBehavior w) {
    this.weapon = w;
  }

  public void setSpeed(SpeedBehavior s) { this.speed = s; }

  protected void performWeapon() {
    weapon.useWeapon();
  }

  protected void performSpeed() {
    speed.move();
  }
}
