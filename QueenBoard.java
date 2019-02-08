public class QueenBoard {
  private int[][] board;
  private int n;
  public QueenBoard(int size) {
    board = new int[size][size];
    n = size;
  }
  private boolean addQueen(int r, int c) {
    if (board[r][c] == 0) {
      board[r][c] = -1;
      for (int i = 0; i < (board.length - c); i++) {
        board[r][c + i] = board[r][c + i] + 1;
        board[r + i][c + i] = board[r + i][c + i] + 1;
      }
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c) {
    if (board[r][c] == -1) {
      board[r][c] = 0;
      for (int i = 0; i < (board.length - c); i++) {
        board[r][c + i] = board[r][c + i] - 1;
        board[r + i][c + i] = board[r + i][c + i] - 1;
      }
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
    return false;
  }
  public int countSolutions() {
    return 0;
  }
  void clear() {
    board = new int[n][n];
  }
}
