package iterator.additionslTask;

import java.util.ArrayList;

public class EvenIterator extends CommonIterator {

  public EvenIterator(ArrayList<Integer> inputList) {
    super(inputList);
    size = inputList.size();
  }

  @Override
  public boolean perform(int item) {
    return item % 2 == 0;
  }
}
