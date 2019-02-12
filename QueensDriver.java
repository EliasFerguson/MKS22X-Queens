public class QueensDriver {
  public static void main(String[] args) {
    QueenBoard test = new QueenBoard(5);
    //Should print true;
    System.out.println(test.solve());
    test.clear();
    System.out.println(test.countSolutions());
  }
}
