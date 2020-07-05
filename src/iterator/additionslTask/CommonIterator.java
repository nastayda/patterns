package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CommonIterator implements Iterator<Integer> {
  protected ArrayList<Integer> list;

  public CommonIterator(ArrayList<Integer> list) {
    this.list = list;
  }

  abstract void moveCursor();
}
