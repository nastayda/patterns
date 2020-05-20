package iterator.additionslTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorClient {
  public List<Integer> printAndGetList(IteratorType numberType, ArrayList<Integer> inputList) {
    List<String> tempList = new ArrayList<>();

    Iterator<?> listIterator = numberType.getIteratorType().setList(inputList);

    while (listIterator.hasNext()) {
      tempList.add(listIterator.next().toString());
    }

    System.out.println(String.format("%s numbers: %s",
        numberType.name(),
        String.join(",", tempList)));

    return tempList.stream().map(Integer::parseInt).collect(Collectors.toList());
  }
}
