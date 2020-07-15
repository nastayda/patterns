package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CommonIterator implements Iterator<Integer>, Comparable<CommonIterator> {
  protected ArrayList<Integer> list;
  protected int currentIndex = 0;
  protected int size;

  public CommonIterator(ArrayList<Integer> list) {
    this.list = list;
  }

  abstract boolean perform(int item);

  @Override
  public int compareTo(CommonIterator o) {
    if (!o.hasNext()) {
      return -1;
    } else if (!this.hasNext()) {
      return 1;
    }
    return (this.nextWithoutShift() - o.nextWithoutShift());
  }

  @Override
  public boolean hasNext() {
    return currentIndex < size && nextWithoutShift() != null;
  }

  @Override
  public Integer next() {
    Integer item = null;
    for (int i = currentIndex; i < size; i++) {
      item = list.get(currentIndex);
      currentIndex = currentIndex + 1;
      if (perform(item)) {
        return item;
      } else {
        item = list.get(currentIndex);
      }
    }
    return item;
  }

  public Integer nextWithoutShift() {
    int nextPosition = currentIndex;

    Integer item = null;
    for (int i = nextPosition; i < size; i++) {
      item = list.get(nextPosition);
      nextPosition = nextPosition + 1;
      if (perform(item)) {
        return item;
      } else if (nextPosition < size) {
        item = list.get(nextPosition);
      } else return null;
    }
    return item;
  }
}
