package general;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 1, 0,},{0, 0, 1},{1, 1, 1},{0, 0, 0}};
        gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void gameOfLife(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int livingNeighbours = 0;

                // above neighbours
                if (i - 1 >= 0) {
                    if(board[i - 1][j] == 1) {
                        livingNeighbours++;
                    }
                    if(j + 1 < board[i].length) {
                        if(board[i - 1][j + 1] == 1) {
                            livingNeighbours++;
                        }
                    }
                    if (j - 1 >= 0) {
                        if(board[i - 1][j - 1] == 1) {
                            livingNeighbours++;
                        }
                    }
                }

                // below neighbours
                if (i + 1 < board.length) {
                    if (board[i + 1][j] == 1) {
                        livingNeighbours++;
                    }
                    if (j + 1 < board[i].length) {
                        if (board[i + 1][j + 1] == 1) {
                            livingNeighbours++;
                        }
                    }
                    if (j - 1 >= 0) {
                        if (board[i + 1][j -1] == 1) {
                            livingNeighbours++;
                        }
                    }
                }

                //left neighbors
                if (j + 1 < board[0].length) {
                    if (board[i][j + 1] == 1) {
                        livingNeighbours++;
                    }
                }

                //right neighbors
                if (j - 1 >= 0) {
                    if (board[i][j - 1] == 1) {
                        livingNeighbours++;
                    }
                }

                if (board[i][j] == 1) {
                    if (livingNeighbours == 2 || livingNeighbours == 3) {
                        newBoard[i][j] = 1;
                    }
                } else {
                    if (livingNeighbours == 3) {
                        newBoard[i][j] = 1;
                    }
                }

            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }
}
