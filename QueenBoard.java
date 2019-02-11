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
      for (int i = 1; i + c < n; i++) {
        board[r - i][c + i] += 1;
        //Going diagonally downwards.
        board[r + i][c + i] += 1;
        //Going diagonally upwards.
        board[r][c + i] += 1;
        //Going horizontally right.
      }
      return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c) {
    if(board.length == 0) return false;
    if (board[r][c] == -1) {
      board[r][c] = 0;
      for (int i = 1; i + c < n; i++) {
        board[r - i][c + i] -= 1;
        //Going diagonally downwards.
        board[r + i][c + i] -= 1;
        //Going diagonally upwards.
        board[r][c + i] -= 1;
        //Going horizontally right.
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
    return solveH(0);
  }
  public boolean solveH(int c) {
    if (c >= n) return true;
    for (int r = 0; r < n; r++) {
      if (addQueen(c, r)) {
        
      }
    }
  }
  public int countSolutions() {
    return 0;
  }
  void clear() {
    board = new int[n][n];
  }

}
