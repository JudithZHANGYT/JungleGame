//Pieces
//totally 16 pieces
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Piece extends JLabel
{

    private final String name;    //name of the piece
    private final int level;      //strength of the piece: 1-8
    private final boolean camp;   //use PLAYER_1 or PLAYER_2
    private int positionX;    //piece's position (0-6)
    private int positionY;    //(0-8)

    private final Image icon;

    public final int PIECE_WIDTH = 80;    //weight and height
    public final int PIECE_HEIGHT = 80;

    Piece(String n, int l, boolean c, int pX, int pY, String address)
    {
        this.name = n;
        this.level = l;
        this.camp = c;
        this.positionX = pX;
        this.positionY = pY;
        this.icon = Toolkit.getDefaultToolkit().getImage(address);
    }

    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public boolean getCamp() {
        return camp;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPosition(int pX, int pY) {
        this.positionX = pX;
        this.positionY = pY;
    }


    public void paint(Graphics g, JPanel i)
    {
        g.drawImage(icon,positionX * PIECE_WIDTH, positionY * PIECE_HEIGHT, PIECE_WIDTH, PIECE_HEIGHT, (ImageObserver)i);
    }

    /*public void capture(){

    }*/
    //public void reverse()
}
