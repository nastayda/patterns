package iterator.additionslTask;

import com.google.common.collect.Iterators;
import java.util.Iterator;

public abstract class CommonIterator implements Iterator<Integer> {
  private Iterator<Integer> iterator;
  private Integer current;

  public CommonIterator(Iterator<Integer>... iterators) {
    this.iterator = Iterators.concat(iterators);
    setValue();
  }

  @Override
  public boolean hasNext() {
    return current != null;
  }

  private void setValue() {
    while (iterator.hasNext()) {
      Integer val = iterator.next();
      if (validateNumber(val)) {
        current = val;
        return;
      }
    }
    current = null;
  }

  @Override
  public Integer next() {
    Integer item = current;
    setValue();
    return item;
  }

  abstract boolean validateNumber(Integer item);
}
