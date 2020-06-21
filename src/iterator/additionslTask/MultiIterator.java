package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MultiIterator implements Iterator<Integer> {
  private int size;
  private Object[] elementData;
  private int cursor;       // index of next element to return
  private int lastRet = -1; // index of last element returned; -1 if no such

  public MultiIterator(CommonIterator... iterators) {
    elementData = getArrayFromIterators(iterators);
    size = elementData.length;
  }

  private Object[] getArrayFromIterators(CommonIterator[] iterators) {
    ArrayList<Integer> modifiedList = new ArrayList<>();

    for (CommonIterator iterator : iterators) {
      modifiedList.addAll(iterator.getModifiedList());
    }
    Collections.sort(modifiedList);
    return modifiedList.toArray();
  }

  public boolean hasNext() {
    return cursor != size;
  }

  public Integer next() {
    int i = cursor;
    cursor = i + 1;
    return (Integer) elementData[lastRet = i];
  }
}
