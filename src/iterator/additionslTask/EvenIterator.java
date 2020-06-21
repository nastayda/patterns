package iterator.additionslTask;

import java.util.ArrayList;

public class EvenIterator extends CommonIterator {
  public EvenIterator(ArrayList<Integer> list) {
    super(list);
  }

  @Override
  boolean validateNumber(Integer item) {
    return item % 2 == 0;
  }
}
