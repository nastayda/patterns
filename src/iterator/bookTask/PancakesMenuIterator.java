package iterator.bookTask;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakesMenuIterator implements Iterator<MenuItem> {

  private ArrayList<MenuItem> menuItems;
  private int position = 0;

  public PancakesMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  // manual realization
  @Override
  public MenuItem next() {
    MenuItem menuItem = menuItems.get(position);
    position = position + 1;
    return menuItem;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.size() && menuItems.get(position) != null;
  }

  @Override
  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException
          ("You can't remove an item until you've done at least one next()");
    }
    if (menuItems.get(position - 1) != null) {
      for (int i = position - 1; i < (menuItems.size() - 1); i++) {
        menuItems.set(i, menuItems.get(i + 1));
      }
      menuItems.set(menuItems.size() - 1, null);
    }
  }

// existed in ArrayList
//  @Override
//  public boolean hasNext() {
//    return menuItems.iterator().hasNext();
//  }
//
//  @Override
//  public MenuItem next() {
//    return menuItems.iterator().next();
//  }
//
//  @Override
//  public void remove() {
//    menuItems.iterator().remove();
//  }
}
