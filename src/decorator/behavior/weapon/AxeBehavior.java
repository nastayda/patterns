package decorator.behavior.weapon;

public class AxeBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("Ax strike");
  }
}
