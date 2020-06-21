package iterator.additionslTask;

import java.util.ArrayList;
import java.util.List;

public class NumbersTest {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    while (i < 10) {
      list.add(i);
      i++;
    }

//    IteratorClient client = new IteratorClient();
//    List<Integer> evenNumbers = client.printAndGetList(IteratorType.EVEN, list);
//    List<Integer> oddNumbers = client.printAndGetList(IteratorType.ODD, list);
//
//    ArrayList<Integer> newValues = new ArrayList<>(oddNumbers);
//    newValues.addAll(evenNumbers);
//    client.printAndGetList(IteratorType.SORTED, newValues);

    MultiIterator odd = new MultiIterator(new OddIterator(list));
    System.out.print("\nOdd: ");
    odd.forEachRemaining(it -> System.out.print(it + ", "));

    MultiIterator even = new MultiIterator(new EvenIterator(list));
    System.out.print("\nEven: ");
    even.forEachRemaining(it -> System.out.print(it + ", "));

    MultiIterator sorted = new MultiIterator(new EvenIterator(list), new OddIterator(list));
    System.out.print("\nSorted: ");
    sorted.forEachRemaining(it -> System.out.print(it + ", "));
  }
}
