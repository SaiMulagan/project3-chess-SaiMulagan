import java.io.*;
import java.util.*;

public class Setup {

	public static void main(String[] args) throws FileNotFoundException {
   	Scanner scan = new Scanner(new File("input1.txt"));
   	String line;
   	String[] lineSegment;

   	while(scan.hasNextLine())
   	{
      	line = scan.nextLine();
       	lineSegment = line.split(" "); // stores all input in array of Strings
			System.out.println(lineSegment[0]);
   	}
	}
}
