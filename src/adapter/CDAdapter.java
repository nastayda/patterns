package adapter;

public class CDAdapter implements WatchFilm {

  private CD cd;

  public CDAdapter(CD cd) {
    this.cd = cd;
  }

  @Override
  public void watch() {
    cd.chooseStart();
    cd.play();
  }
}
