package iterator.additionslTask;

import java.util.Arrays;

public class MultiIterator {
  private final CommonIterator[] iterators;

  public MultiIterator(CommonIterator... iterators) {
    this.iterators = iterators;
  }

  public Integer next() {
    Arrays.sort(iterators);
    return iterators[0].next();
  }

  public boolean hasNext() {
    Arrays.sort(iterators);
    return iterators[0].hasNext();
  }
}
