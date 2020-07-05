package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MultiIterator {
  private final CommonIterator[] iterators;

  public MultiIterator(CommonIterator... iterators) {
    this.iterators = iterators;
  }

  public Integer next() {
    ArrayList<Integer> temp = new ArrayList<>();

    for (CommonIterator iterator : iterators) {
      if (iterator.hasNext()) {
        temp.add(iterator.next());
      } else temp.add(Integer.MAX_VALUE);
    }
    Integer min = Collections.min(temp);
    iterators[temp.indexOf(min)].moveCursor();
    return min;
  }

  public boolean hasNext() {
    return Arrays.stream(iterators).anyMatch(Iterator::hasNext);
  }
}
