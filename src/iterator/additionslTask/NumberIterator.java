package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Iterator;

public interface NumberIterator extends Iterator<Integer> {
  NumberIterator setList(ArrayList<Integer> inputList);
}
