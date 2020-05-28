package state;

public class Resume {
  private State createdState;
  private State publishedState;
  private State changedState;
  private State deletedState;

  private State state;

  public Resume() {
    createdState = new CreatedState(this);
    publishedState = new PublishedState(this);
    changedState = new ChangedState(this);
    deletedState = new DeletedState(this);

    state = createdState;
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

  public State getChangedState() {
    return changedState;
  }

  public State getPublishedState() {
    return publishedState;
  }

  public State getDeletedState() {
    return deletedState;
  }
}
