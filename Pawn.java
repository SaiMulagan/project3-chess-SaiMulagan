public class Pawn extends ChessPiece {
    public Pawn(int col, int row) {
        super(col, row);
    }
    public boolean move(int toCol, int toRow) {
        System.out.println("PAWN: (" + getColumn() + "," + getRow() + ") ("+ toCol + "," + toRow + ")");
        int rowDis = Math.abs(toRow - getRow());
        int colDis = Math.abs(toCol - getColumn());
        if (colDis==0){
            if (rowDis==1){
                return true;
            }
            //This allows pawn to move 2 spaces at the beginning of game assuming the board is set correctly
            else if((getRow()==1 && toRow-getRow()==2) || (getRow()==6 && getRow()-toRow==2)){
                return true;
            }
            else{return false;}

        }
        else{
        return false;
    }}
    public String toString() {
        return "-p- ";
    }
}
