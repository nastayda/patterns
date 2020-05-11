package facade;

public class AuthorizationData {
  private String login;
  private String password;

  public AuthorizationData(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public String getLogin() {
    return login;
  }
}
