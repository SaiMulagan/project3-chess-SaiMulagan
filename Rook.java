public class Rook extends ChessPiece {
    public Rook(int col, int row) {
        super(col, row);
    }

    public boolean move(int toCol, int toRow) {
        System.out.println("ROOK: (" + getColumn() + "," + getRow() + ") ("+ toCol + "," + toRow + ")");
        int rowDis = Math.abs(toRow - getRow());
        int colDis = Math.abs(toCol - getColumn());
        if(rowDis==0) {
            if(colDis>=1)
                return true;
        }
        else if(colDis==0) {
            if(rowDis>=1)
                return true;
        }
        return false;
    }

    public String toString() {
        return "-r- ";
    }
}