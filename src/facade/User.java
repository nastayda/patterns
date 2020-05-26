package facade;

public class User {
  private String fullName;
  private String gender;
  private String birthDate;

  public User(String fullName, String gender, String birthDate) {
    this.fullName = fullName;
    this.gender = gender;
    this.birthDate = birthDate;
  }

  public String getFullName() {
    return fullName;
  }
}
