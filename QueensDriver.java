public class QueensDriver {
  public static void main(String[] args) {
    QueenBoard test = new QueenBoard(8);
    System.out.println(test.toString());
    //Should print true;
    System.out.println(test.solve());
  }
}
