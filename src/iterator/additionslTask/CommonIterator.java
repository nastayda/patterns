package iterator.additionslTask;

import java.util.ArrayList;

public abstract class CommonIterator {
  public ArrayList<Integer> list;
  public ArrayList<Integer> modifiedList = new ArrayList<>();

  public CommonIterator(ArrayList<Integer> list) {
    this.list = list;
    sortElements();
  }

  private void sortElements() {
    for (Integer item : list) {
      if (validateNumber(item)) {
        modifiedList.add(item);
      }
    }
  }

  public ArrayList<Integer> getModifiedList() {
    return modifiedList;
  }

  abstract boolean validateNumber(Integer item);
}
