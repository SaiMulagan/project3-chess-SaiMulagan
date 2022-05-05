public class Empty extends ChessPiece{
    public Empty(int col, int row) {
        super(col, row);
    }
        public boolean move(int toCol, int toRow) {
            return false;
        }

    public String toString() {
        return "--- ";
    }
}

