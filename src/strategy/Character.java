package strategy;

import strategy.behavior.speed.SpeedBehavior;
import strategy.behavior.weapon.WeaponBehavior;

public abstract class Character {
  protected WeaponBehavior weapon;
  protected SpeedBehavior speed;

  public void setWeapon(WeaponBehavior w) {
    this.weapon = w;
  }

  public void setSpeed(SpeedBehavior s) { this.speed = s; }

  protected abstract void fight();

  protected abstract void move();

  protected void performWeapon() {
    weapon.useWeapon();
  }

  protected void performSpeed() {
    speed.move();
  }
}
