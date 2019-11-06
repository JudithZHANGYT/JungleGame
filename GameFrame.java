//Draw a frame
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame
{
    //Block size
    public static final int BLOCK_WIDTH = 80;
    public static final int BLOCK_HEIGHT = 80;

    //Number of blocks
    public static final int ROW = 9;
    public static final int COLUMN = 7;

    public GameFrame()
    {
        /* add pieces (qizi) here
        * and this.setLocation()*/
        /* need to draw river later*/
        /* fill fillRect()*/

        this.setTitle("JungleGame");
        this.setSize(BLOCK_WIDTH * COLUMN, BLOCK_HEIGHT * ROW + 20);
        this.setVisible(true);

    }

    //Draw Lines
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        for(int i = 0; i < ROW; i++)
            g.drawLine(0, i * BLOCK_HEIGHT + 15, COLUMN * BLOCK_WIDTH, i * BLOCK_HEIGHT + 15);
        for(int i = 0; i < COLUMN; i++)
            g.drawLine(i * BLOCK_WIDTH, 0, i * BLOCK_WIDTH, ROW * BLOCK_HEIGHT);
        //g.drawImage();
    }


    public static void main(String[] args)
    {
        new GameFrame();
    }
}
