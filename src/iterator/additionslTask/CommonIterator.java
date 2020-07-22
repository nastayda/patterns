package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CommonIterator implements Iterator<Integer>, Comparable<CommonIterator> {
  protected ArrayList<Integer> list;
  protected int currentIndex = 0;
  protected int size;
  private Integer nextElement;
  private int nextPosition;

  public CommonIterator(ArrayList<Integer> list) {
    this.list = list;
    size = list.size();
    nextWithoutShift();
  }

  abstract boolean perform(int item);

  @Override
  public int compareTo(CommonIterator o) {
    if (!o.hasNext()) {
      return -1;
    } else if (!this.hasNext()) {
      return 1;
    }
    return (this.getNextElement() - o.getNextElement());
  }

  @Override
  public boolean hasNext() {
    return currentIndex < size && nextWithoutShift() != null;
  }

  private Integer getNextElement() {
    return nextElement;
  }

  @Override
  public Integer next() {
    currentIndex = nextPosition;
    return nextElement;
  }

  public Integer nextWithoutShift() {
    nextPosition = currentIndex;

    for (int i = nextPosition; i < size; i++) {
      Integer item = list.get(nextPosition);
      nextPosition = nextPosition + 1;

      if (perform(item)) {
        nextElement = item;
        return item;
      }
    }
    nextElement = null;
    return null;
  }
}
