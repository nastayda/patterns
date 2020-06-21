package iterator.additionslTask;

import java.util.ArrayList;

public class OddIterator extends CommonIterator {
  public OddIterator(ArrayList<Integer> list) {
    super(list);
  }

  @Override
  boolean validateNumber(Integer item) {
    return item % 2 != 0;
  }
}
