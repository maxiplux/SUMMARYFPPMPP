package exercise_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class OldFileIO {
	private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
	public final static String FILE_LOCATION = System.getProperty("user.dir") 
			+ "\\src\\lesson10\\exercise_3\\word_test.txt";
	
	void readText(String filename)  {
		
		try (BufferedReader buf =  new BufferedReader( new FileReader( new File(filename) ) ) ) 
		{
			
			buf.lines().forEach( System.out::println) ;
			
			
		}
		catch(IOException e) {
			LOG.warning("IOException thrown when reading file: " + e.getMessage());
		}
		 
		
		 
	}
	
	public static void main(String[] args) {
		OldFileIO oldfile = new OldFileIO();
		String filename = FILE_LOCATION;
        oldfile.readText(filename);
	}

}
