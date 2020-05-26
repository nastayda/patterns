package facade;

public class TestFacade {
  public static void main(String[] args) {
    RegistrationFacade facade = new RegistrationFacade();

    facade.registerUser("Nas", "f", "31 dec",
        "nas@da.ni", "klg", "nice");
  }
}
