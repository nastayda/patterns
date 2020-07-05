package iterator.additionslTask;

import java.util.ArrayList;

public class OddIterator extends CommonIterator {
  private int cursor = 0;
  private int size;

  public OddIterator(ArrayList<Integer> inputList) {
    super(inputList);
    size = list.size();
  }

  @Override
  void moveCursor() {
    cursor = Math.min((cursor + 2), size);
  }

  @Override
  public boolean hasNext() {
    return cursor < size && list.get(cursor) != null;
  }

  @Override
  public Integer next() {
    int localPosition = cursor;

    Integer item = list.get(localPosition);
    for (int i = localPosition; i < size; i++) {
      localPosition = localPosition + 1;
      if (item % 2 != 0) {
        return item;
      } else {
        item = list.get(localPosition);
      }
    }
    return item;
  }
}
