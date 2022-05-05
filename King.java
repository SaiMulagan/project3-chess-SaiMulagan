public class King extends ChessPiece {
    public King(int col, int row) {
            super(col, row);
        }
        public boolean move(int toCol, int toRow) {
            System.out.println("KING: (" + getColumn() + "," + getRow() + ") ("+ toCol + "," + toRow + ")");
            int rowDis = Math.abs(toRow - getRow());
            int colDis = Math.abs(toCol - getColumn());
            if ((colDis==0 && rowDis==1) ||(rowDis==0 && colDis==1) ){
                    return true;}
            else if(colDis == 1 && rowDis == colDis){
                return true;}

            else{
                return false;
            }

            }
        public String toString() {
            return "-K- ";
        }
    }

