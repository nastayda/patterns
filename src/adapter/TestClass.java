package adapter;

public class TestClass {
  public static void main(String[] args) {
    CD cd = new CD();
    WatchFilm watchFilmUsingCd = new CDAdapter(cd);
    watchFilmUsingCd.watch();

    WatchFilm watchFilmThruFlash = new Flash();
    watchFilmThruFlash.watch();
  }
}
