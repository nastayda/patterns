package patterns.strategy.behavior.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("Archery");
  }
}
