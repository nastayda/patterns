package iterator.additionslTask;

import java.util.Iterator;

public class SortedIterator extends CommonIterator {
  public SortedIterator(Iterator<Integer>... iterators) {
    super(iterators);
  }

  @Override
  boolean validateNumber(Integer item) {
    return item > 0;
  }
}
