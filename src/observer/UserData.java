package observer;

import java.util.ArrayList;

public class UserData implements Subject {

  private final ArrayList<Observer> observers;
  private String name;
  private String surname;

  public UserData() {
    observers = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(name, surname);
    }
  }

  public void setData(String name, String surname){
    this.name = name;
    this.surname = surname;
    notifyObservers();
  }
}
