public class ChessBoard {
    private String[][] board;

    public ChessBoard()
    {
        int n=8;
        board = new String[n][n];
        for (int row=n-1; row>=0; row--)
        {
            for (int col=0; col<n; col++)
            {
                board[row][col]= "--- ";
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
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
        return " ";
    }
    public void setPiece(String t, int i, int j)
    {
        board[i][j]=t;
    }
    public String getPiece(int i, int j)
    {
        return board[i][j];
    }
}


