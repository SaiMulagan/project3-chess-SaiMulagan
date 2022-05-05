public class Bishop extends ChessPiece {

        public Bishop(int col, int row) {
            super(col, row);
        }

        public boolean move(int toCol, int toRow) {
            System.out.println("BISHOP: (" + getColumn() + "," + getRow() + ") ("+ toCol + "," + toRow + ")");
            int rowDis = Math.abs(toRow - getRow());
            int colDis = Math.abs(toCol - getColumn());

                if(colDis != 0 && rowDis == colDis){
                    return true;}

                return false;
        }

        public String toString() {
            return "-b- ";
        }
    }
