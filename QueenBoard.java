public class QueenBoard {
  private int[][] board;
  public QueenBoard(int size) {
    board = new int[size][size];
  }
  private boolean addQueen(int r, int c) {
    if (board[r][c] == 0) {
      board[r][c] = -1;
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c) {
    if (board[r][c] == -1) {
      board[r][c] = 0;
      return true;
    }
    return false;
  }
  public String toString() {
    String output = "";
    for (int[] elem:board) {
      for (int num:elem) {
        if (num == -1) output += 'Q' + " ";
        else output += '_' + " ";
      }
      output += '\n';
    }
    return output;
  }
  public boolean solve() {

  }
  public int countSolutions() {
    int returner = 0;
    for (int[] elem:board) {
      for (int num:elem) {
        if (num == -1) returner++;
      }
    }
    return returner;
  }
}
