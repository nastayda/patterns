package state;

public class Resume {
  private State isCreatedState;
  private State isPublishedState;
  private State isChangedState;
  private State isDeletedState;

  private State state;

  public Resume() {
    isCreatedState = new CreatedState(this);
    isPublishedState = new PublishedState(this);
    isChangedState = new ChangedState(this);
    isDeletedState = new DeletedState(this);

    state = isCreatedState;
  }

  public void change() {
    state.change();
  }

  public void publish() {
    state.publish();
  }

  public void delete() {
    state.delete();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getIsChangedState() {
    return isChangedState;
  }

  public State getIsPublishedState() {
    return isPublishedState;
  }

  public State getIsDeletedState() {
    return isDeletedState;
  }
}
