import javax.swing.*;
import java.awt.*;
//launch the game
public class JungleGameMain extends JFrame
{


    public static final int BLOCK_WIDTH = 80;
    public static final int BLOCK_HEIGHT = 80;

    //Number of blocks
    public static final int ROW = 9;
    public static final int COLUMN = 7;

    public GameFrame board = new GameFrame();

    public JungleGameMain()
    {
        this.setTitle("JungleGame");
        this.setSize(BLOCK_WIDTH * COLUMN, BLOCK_HEIGHT * ROW + 20);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JungleGameMain();
    }
}
