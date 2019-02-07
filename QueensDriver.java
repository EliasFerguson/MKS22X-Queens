public class QueensDriver {
  public static void main(String[] args) {
    QueenBoard test = new QueenBoard(8);
    System.out.println(test.toString());
    test.addQueen(1, 1);
    System.out.println(test.toString());
    test.removeQueen(1, 1);
    System.out.println(test.toString());
    test.removeQueen(1, 1);
    System.out.println(test.toString());
    test.addQueen(1, 1);
    System.out.println(test.toString());
    test.addQueen(1, 1);
    System.out.println(test.toString());
  }
}
