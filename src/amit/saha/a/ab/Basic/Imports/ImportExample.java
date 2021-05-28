package amit.saha.a.ab.Basic.Imports;

//including so many classes doesn’t slows down your program execution.The compiler figures out what’s actually needed
import java.util.Random;
import java.util.*;

//below will not compile because of conflicts
//import java.sql.Date;
//import java.util.Date;

//Below will compile and util will be used as util.Date is explicitly imported
import java.sql.*;
import java.util.Date;

//Below will not work as subdirectories are not imported
//import java.nio.*;

//only one wild card allowed 
//import java.nio.*.*;

//methods are not imported
//import java.nio.file.Paths.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportExample {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
		Date date;
	    
	}
	
	public void read(Files files) {
	      Paths.get("name");
	   }
}
