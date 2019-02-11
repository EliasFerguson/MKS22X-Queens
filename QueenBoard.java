public class QueenBoard {
  private int[][] board;
  private int n;
  public QueenBoard(int size) {
    board = new int[size][size];
    n = size;
  }
  private boolean addQueen(int r, int c) {
    if(board.length == 0) return false;
    if (board[r][c] == 0) {
      board[r][c] = -1;
      alterBoard(r, c, 1);
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c) {
    if(board.length == 0) return false;
    if (board[r][c] == -1) {
      board[r][c] = 0;
      alterBoard(r, c, -1);
      return true;
    }
    return false;
  }
  private void alterBoard(int r, int c, int num) {
    for (int i = 1; c + i < board.length; i++) {
      if (r - i >= 0) {
        board[r][c + i] += num;
        //Horizonatally right.
        board[r - i][c + i] += num;
        //Diagonally DOWN.
      }
      if (r + i < board.length) {
        board[r + i][c + i] += num;
        //Diagonally UP.
        board[r][c + i] += num;
        //Horizonatally right.
      }
    }
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
  public String toStringDebug() {
    String output = "";
    for (int[] elem:board) {
      for (int num:elem) {
        output += num + " ";
      }
      output += '\n';
    }
    return output;
  }
  public boolean solve() {
    return solveH(0);
  }
  public boolean solveH(int c) {
    System.out.println(toString());
    if (c >= n) return true;
    for (int r = 0; r < n; r++) {
      if (addQueen(r, c)) {
        if (solveH(c + 1)) return true;
        removeQueen(r, c);
      }
    }
    return false;
  }
  public int countSolutions() {
    return 0;
  }
  void clear() {
    board = new int[n][n];
  }
}
