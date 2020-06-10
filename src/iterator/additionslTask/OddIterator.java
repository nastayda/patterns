package iterator.additionslTask;

import java.util.Iterator;

public class OddIterator extends CommonIterator {

  public OddIterator(Iterator<Integer> iterator) {
    super(iterator);
  }

  @Override
  boolean validateNumber(Integer item) {
    return item % 2 != 0;
  }
}
