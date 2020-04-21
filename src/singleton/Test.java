package singleton;

public class Test {
  public static void main(String args[]) {
    TodayDate date = TodayDate.getInstance();
    date.setDateToNow();
    date.getDate();

    TodayDate dateNew = TodayDate.getInstance();
    dateNew.getDate();
  }
}
