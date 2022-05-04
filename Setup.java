import java.io.*;
import java.util.*;

public class Setup {

	public static void main(String[] args) throws FileNotFoundException {
		ChessBoard board = new ChessBoard();
		Scanner scan = new Scanner(new File("input1.txt"));
   	String line;
   	String[] lineSegment;

   	while(scan.hasNextLine())
   	{
      	line = scan.nextLine();
       	lineSegment = line.split(" "); // stores all input in array of Strings
			System.out.println(lineSegment[0]);
		int r = Integer.parseInt(lineSegment[1]);
		int c = Integer.parseInt(lineSegment[2]);
		String p = lineSegment[0].substring(0, 1);
		if (p.contains("k") && lineSegment[0].contains("t")){p="h";}
		board.setPiece("-"+p+"- ",c,r);

	}

		System.out.println(board);
		//board.setPiece("-p- ",0,0);
		//System.out.println(board);
	}
}
