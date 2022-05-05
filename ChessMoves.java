import java.io.*;
import java.util.*;

public class ChessMoves {

    public static void main(String[] args) throws FileNotFoundException {
        ChessBoard board = new ChessBoard();
        Scanner scan = new Scanner(new File("input2.txt"));
        String line;
        String[] lineSegment;
        System.out.println(board);
        while(scan.hasNextLine())
        {
            line = scan.nextLine();
            lineSegment = line.split(" "); // stores all input in array of Strings
            if (lineSegment.length<=1){
                System.out.println();
                continue;
            }
            //System.out.println(lineSegment[0]);
            int c = Integer.parseInt(lineSegment[1]);
            int r = Integer.parseInt(lineSegment[2]);

            String p =lineSegment[0];
            switch (p) {
                case "pawn":
                    ChessPiece pawn = new Pawn(c, r);
                    board.setPiece(pawn, c, r);
                    break;
                case "rook":
                    ChessPiece rook = new Rook(c, r);
                    board.setPiece(rook, c, r);
                    break;
                case "knight":
                    ChessPiece knight = new Knight(c, r);
                    board.setPiece(knight, c, r);
                    break;
                case "bishop":
                    ChessPiece bishop = new Bishop(c, r);
                    board.setPiece(bishop, c, r);
                    break;
                case "move":

                    ChessPiece empty = new Empty(c,r);
                    int tc = Integer.parseInt(lineSegment[3]);
                    int tr = Integer.parseInt(lineSegment[4]);
                    ChessPiece thatSpace = board.getPiece(c,r);
                    if(thatSpace.move(tc,tr)){
                        board.setPiece(thatSpace, tc, tr);
                        board.setPiece(empty, c, r);
                        System.out.println("Moved! (" + c + "," + r + ") ("+ tc + "," + tr + ")");
                        System.out.println("===================================");
                        System.out.println(board);
                        break;
                    }
                    else {System.out.println("Invalid move. (" + c + "," + r + ") ("+ tc + "," + tr + ")");
                        System.out.println("===================================");
                        System.out.println(board);
                        break;
                    }
                    //System.out.println(c+"+"+r);
                    //System.out.println(tc+"+"+tr);


            }
        }
    }
}
