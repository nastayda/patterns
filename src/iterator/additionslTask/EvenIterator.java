package iterator.additionslTask;

import java.util.Iterator;

public class EvenIterator extends CommonIterator {
  public EvenIterator(Iterator<Integer> currentIterator) {
    super(currentIterator);
  }

  @Override
  boolean validateNumber(Integer item) {
    return item % 2 == 0;
  }
}
