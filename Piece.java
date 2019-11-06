//Pieces
//totally 16 pieces
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Piece
{
    public static final boolean PLAYER_1 = true;    //for camp
    public static final boolean PLAYER_2 = false;

    private final String name;    //name of the piece
    private final int level;      //strength of the piece: 1-8
    private final boolean camp;   //use PLAYER_1 or PLAYER_2
    private Coordinate position;    //piece's position

    private final ImageIcon icon;

    public final int PIECE_WEIGHT = 80;    //weight and height
    public final int PIECE_HEIGHT = 80;

    Piece(String n, int l, boolean c, Coordinate p, String address)
    {
        this.name = n;
        this.level = l;
        this.camp = c;
        this.position = p;
        this.icon = new ImageIcon(address); //need adjusting
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

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public void move(Coordinate newposition)
    {
        this.setPosition(newposition);
    }
    /*public void capture(){

    }*/
}
