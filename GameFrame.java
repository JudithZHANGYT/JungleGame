//Draw a frame
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFrame extends JPanel
{
    public static final int BLOCK_WIDTH = 80;      //Block size
    public static final int BLOCK_HEIGHT = 80;

    public static final int ROW = 9;        //Number of blocks
    public static final int COLUMN = 7;

    public static final boolean PLAYER_1 = true;   //Piece's camp
    public static final boolean PLAYER_2 = false;

    public static Piece[][] gameBoard = new Piece[ROW][COLUMN];    //Record the board including piece's position
    public static boolean currentPlayer = PLAYER_1;    //Current player

    public Piece firstPiece = null;        //First and Second Chosen Piece
    public Piece secondPiece = null;

    public GameFrame()
    {
        /* add pieces (qizi) here
        * and this.setLocation()*/
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //e.getX();
                //e.getY();
            }
        });


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
        /* need to draw river later*/
        /* fill fillRect()*/
    }

}
