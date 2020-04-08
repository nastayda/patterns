package singleton;

import java.time.LocalDateTime;

public class TodayDate {
  private volatile static TodayDate uniqueInstance;

  private LocalDateTime date;

  private TodayDate() {
  }

  public static TodayDate getInstance() {
    if (uniqueInstance == null) {
      synchronized (TodayDate.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new TodayDate();
        }
      }
    }
    return uniqueInstance;
  }

  public void getDate() {
    System.out.println("Today is " + date.toString());
  }

  public void setDateToNow() {
    if (date == null) {
      date = LocalDateTime.now();
    }
  }
}
