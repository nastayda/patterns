package state;

public interface State {
  void create();

  void change();

  void publish();

  void delete();
}
