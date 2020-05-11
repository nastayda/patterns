package facade;

public class RegistrationFacade {
  private User user;
  private AuthorizationData authData;
  private BonusAccount bonusCount;
  private BankAccount cardNumber;
  private Address address;
  private PhotoStorage photo;

  public void registerUser(String name, String gender, String birthDate,
                           String login, String address, String photo) {
    RegistrationFacade user = new RegistrationFacade()
        .setUser(new User(name, gender, birthDate))
        .setAuthData(new AuthorizationData(login, "123"))
        .setBonusCount(new BonusAccount(123))
        .setAddress(new Address(address))
        .setPhoto(new PhotoStorage(photo));


    String regData = String.format("---- User registration data ----\n" +
            "User name: %s \n" +
            "User login: %s \n" +
            "User bonus count: %s \n" +
            "User address: %s \n" +
            "User was created",
        user.getUser().getFullName(),
        user.getAuthData().getLogin(),
        user.getBonusCount().getBonusCount(),
        user.getAddress().getAddress());
    System.out.println(regData);
  }

  public User getUser() {
    return user;
  }

  public AuthorizationData getAuthData() {
    return authData;
  }

  public BonusAccount getBonusCount() {
    return bonusCount;
  }

  public BankAccount getCardNumber() {
    return cardNumber;
  }

  public Address getAddress() {
    return address;
  }

  public PhotoStorage getPhoto() {
    return photo;
  }

  private RegistrationFacade setPhoto(PhotoStorage photo) {
    this.photo = photo;
    return this;
  }

  private RegistrationFacade setAddress(Address address) {
    this.address = address;
    return this;
  }

  private RegistrationFacade setBonusCount(BonusAccount bonusCount) {
    this.bonusCount = bonusCount;
    return this;
  }

  private RegistrationFacade setAuthData(AuthorizationData authData) {
    this.authData = authData;
    return this;
  }

  private RegistrationFacade setUser(User user) {
    this.user = user;
    return this;
  }
}
