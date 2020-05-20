package iterator.additionslTask;

import iterator.additionslTask.numbersIterators.SortedNumbersIterator;
import iterator.additionslTask.numbersIterators.EvenNumbersIterator;
import iterator.additionslTask.numbersIterators.OddNumbersIterator;

public enum IteratorType {
  EVEN(new EvenNumbersIterator()),
  ODD(new OddNumbersIterator()),
  SORTED(new SortedNumbersIterator());

  private final NumberIterator iterator;

  public NumberIterator getIteratorType() {
    return iterator;
  }

  IteratorType(NumberIterator iterator) {
    this.iterator = iterator;
  }
}
