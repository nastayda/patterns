package iterator;

import java.util.Iterator;

public interface Menu {
	Iterator<?> createIterator();

	String getMenuName();
}
