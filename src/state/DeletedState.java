package state;

public class DeletedState implements State {
  private Resume resume;

  public DeletedState(Resume resume) {
    this.resume = resume;
  }

  @Override
  public void create() {
    System.out.println("Resume was created and deleted, you cant delete it");
  }

  @Override
  public void change() {
    System.out.println("Resume was deleted, you cant change it");
  }

  @Override
  public void publish() {
    System.out.println("Resume was deleted, you cant publish it");
  }

  @Override
  public void delete() {
    System.out.println("Resume was deleted, you cant delete it");
  }
}
