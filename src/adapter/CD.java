package adapter;

import java.util.Scanner;

public class CD {

  public void chooseStart() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a minutes for start : ");
    int startMin = in.nextInt();
    System.out.println(String.format("Start film from %s min", startMin));
  }

  public void play() {
    System.out.println("Film is playing...");
  }
}
