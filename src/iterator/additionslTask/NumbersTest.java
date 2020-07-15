package iterator.additionslTask;

import java.util.ArrayList;

public class NumbersTest {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    while (i < 6) {
      list.add(i);
      i++;
    }

    MultiIterator oddIter = new MultiIterator(new OddIterator(list));
    System.out.print("\nOdd using multi: ");
    while (oddIter.hasNext()) {
      System.out.print(oddIter.next() + ", ");
    }

    MultiIterator evenIterMulti = new MultiIterator(new EvenIterator(list));
    System.out.print("\nEven using multi: ");
    while (evenIterMulti.hasNext()) {
      System.out.print(evenIterMulti.next() + ", ");
    }

    MultiIterator multiIterator = new MultiIterator(new EvenIterator(list), new OddIterator(list));
    System.out.print("\nMulti: ");
    while (multiIterator.hasNext()) {
      System.out.print(multiIterator.next() + ", ");
    }
  }
}
