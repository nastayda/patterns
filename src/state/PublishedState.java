package state;

public class PublishedState implements State {
  private Resume resume;

  public PublishedState(Resume resume) {
    this.resume = resume;
  }

  @Override
  public void create() {
    System.out.println("Resume has been already created");
  }

  @Override
  public void change() {
    System.out.println("Resume was changed");
    resume.setState(resume.getIsChangedState());
  }

  @Override
  public void publish() {
    System.out.println("Resume has been already published, you cant publish it again");
  }

  @Override
  public void delete() {
    System.out.println("Resume was deleted");
    resume.setState(resume.getIsDeletedState());
  }
}
