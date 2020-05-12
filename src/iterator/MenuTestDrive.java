package iterator;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<>();
		menus.add(dinerMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
