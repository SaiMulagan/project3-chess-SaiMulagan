public class Knight extends ChessPiece {
    public Knight(int col, int row) {
        super(col, row);
    }

    public boolean move(int toCol, int toRow) {
        System.out.println("KNIGHT: (" + getColumn() + "," + getRow() + ") ("+ toCol + "," + toRow + ")");
        int rowDis = Math.abs(toRow - getRow());
        int colDis = Math.abs(toCol - getColumn());

            if(rowDis == 2 && colDis == 1)
                return true;
            else if(rowDis == 1 && colDis == 2)
                return true;
        return false;
    }

    public String toString() {
        return "-h- ";
    }
}

