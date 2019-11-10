//all game rules are here
//check whether the movement obeys game rules
public class Rule {
    public static boolean isLegalMove(Piece origin, int targetX, int targetY)
    {
        //target is null (no piece) or the piece in the target position
        Piece target = GameFrame.gameBoard[targetX][targetY];

        //origin.getPositionX() and origin.getPositionY() return X and Y (position) of origin piece

        switch (origin.getLevel())
        {
            case 1:     //Rat
                /*Step 1: If there is piece in the target position, check whether the origin piece can capture it
                          if yes, go to Step 2, if no, return false
                          if there is no piece in the target position, go to Step 2
                  Step 2: Check if the origin piece can move that far
                          if yes, return true, if no, return false
                          just to consider the surrounding 8 blocks
                          but for rat, tiger and lion, the river should be taken to consideration*/
                break;
            case 2:     //Cat
                break;
            case 3:     //Dog
                break;
            case 4:     //Wolf
                break;
            case 5:     //Leopard
                break;
            case 6:     //Tiger
                break;
            case 7:     //Lion
                break;
            case 8:     //Elephant
                break;
            default:    //Nothing to do here
                break;
        }
        return false;
    }
}
