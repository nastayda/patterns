package iterator.additionslTask.numbersIterators;

import iterator.additionslTask.NumberIterator;
import java.util.ArrayList;

public class EvenNumbersIterator implements NumberIterator {
  private ArrayList<Integer> inputList;
  private int position = 0;

  public EvenNumbersIterator setList(ArrayList<Integer> inputList) {
    this.inputList = inputList;
    return this;
  }

  @Override
  public boolean hasNext() {
    return position < inputList.size() && inputList.get(position) != null;
  }

  @Override
  public Integer next() {
    Integer item = inputList.get(position);
    for (int i = position; i < inputList.size(); i++) {
      position = position + 1;
      if (item % 2 == 0) {
        position = position + 1;
        return item;
      } else {
        item = inputList.get(position);
      }
    }
    return item;
  }
}
