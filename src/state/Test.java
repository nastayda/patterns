package state;

public class Test {
  public static void main(String[] args) {
    Resume resume = new Resume();
    resume.publish();
    resume.change();
    resume.publish();
    resume.delete();
    resume.change();
    resume.delete();
  }
}
