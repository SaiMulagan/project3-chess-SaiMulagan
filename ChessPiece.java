abstract class ChessPiece {
    private int col;
    private int row;
    //public static enum Piece {empty, pawn, rook, knight, bishop}
    public ChessPiece(int col, int row){
        this.row=row;
        this.col=col;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return col;
    }
    public void setColumn(int j) {
         this.col=j;
    }
    public void setRow(int i) {
        this.row=i;
    }

    public abstract boolean move(int toCol, int toRow);

}

