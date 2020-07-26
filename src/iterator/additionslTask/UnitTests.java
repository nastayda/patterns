package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class UnitTests {

  @Test
  public void testComparator() {

    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    while (i < 3) {
      list.add(i);
      i++;
    }

    MultiIterator mi = new MultiIterator(
        new EvenIterator(list),
        new OddIterator(list)
    );

    CommonIterator[] iterators = mi.getIterators();
    Arrays.sort(iterators);

    assert iterators[0].next() < iterators[1].next();
  }
}
