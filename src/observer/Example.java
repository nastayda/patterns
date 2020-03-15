package observer;

public class Example {
  public static void main(String[] args) {
    UserData userData = new UserData();

    BaseStorage baseStorage = new BaseStorage(userData);
    LoggingSystem logSystem = new LoggingSystem(userData);
    ExternalSystem externalSystem = new ExternalSystem(userData);

    userData.setData("Nastya", "Da");
    userData.setData("Ira", "P");
  }
}
