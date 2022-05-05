public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard()
    {
        int n=8;
        board = new ChessPiece[n][n];
        for (int col=n-1; col>=0; col--)
        {
            for (int row=0; row<n; row++)
            {
                board[col][row]= new Empty(col,row);
            }
        }
    }
    public String toString()
    {
        for (int i=board.length-1; i>=-1; i--)
        {
            if (i==-1){System.out.print("=== ");}
            else{System.out.print("="+(i)+"= ");}
            for (int j=0; j<board[1].length; j++)
            {
                if (i==-1){System.out.print("="+(j)+"= ");}
                else {
                    System.out.print(board[j][i]);
                }
            }
            System.out.println();
        }
        return " ";
    }
    public void setPiece(ChessPiece t, int i, int j)
    {
        board[i][j]=t;
        t.setColumn(i);
        t.setRow(j);

    }
    public ChessPiece getPiece(int i, int j)
    {
        return board[i][j];
    }
}


