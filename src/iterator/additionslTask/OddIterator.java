package iterator.additionslTask;

import java.util.ArrayList;

public class OddIterator extends CommonIterator {

  public OddIterator(ArrayList<Integer> inputList) {
    super(inputList);
  }

  @Override
  public boolean perform(int item) {
    return item % 2 != 0;
  }
}
