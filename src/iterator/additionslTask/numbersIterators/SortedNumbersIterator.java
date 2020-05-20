package iterator.additionslTask.numbersIterators;

import iterator.additionslTask.NumberIterator;
import java.util.ArrayList;
import java.util.Collections;

public class SortedNumbersIterator implements NumberIterator {
  private ArrayList<Integer> inputList;

  private int position = 0;

  @Override
  public SortedNumbersIterator setList(ArrayList<Integer> inputList) {
    this.inputList = inputList;
    Collections.sort(inputList);
    return this;
  }

  @Override
  public boolean hasNext() {
    return position < inputList.size() && inputList.get(position) != null;
  }

  @Override
  public Integer next() {
    Integer item = inputList.get(position);
    position = position + 1;
    return item;
  }
}
