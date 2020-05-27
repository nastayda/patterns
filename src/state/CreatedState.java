package state;

public class CreatedState implements State {

  private Resume resume;

  public CreatedState(Resume resume) {
    this.resume = resume;
  }

  @Override
  public void create() {
    System.out.println("Resume has been already created");
  }

  @Override
  public void change() {
    System.out.println("Resume was changed");
    resume.setState(resume.getChangedState());
  }

  @Override
  public void publish() {
    System.out.println("Resume was published");
    resume.setState(resume.getPublishedState());
  }

  @Override
  public void delete() {
    System.out.println("Resume was deleted");
    resume.setState(resume.getDeletedState());
  }
}
