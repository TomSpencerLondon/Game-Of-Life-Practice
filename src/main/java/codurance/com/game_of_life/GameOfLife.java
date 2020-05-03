package codurance.com.game_of_life;

public class GameOfLife {
    public boolean[][] board;

    public GameOfLife(boolean[][] board) {
        this.board = board;
    }

    public void nextGen() {
        board = new boolean[][]{
                {false, false, false},
                {false, false, false},
                {false, false, false}};
    }
}
