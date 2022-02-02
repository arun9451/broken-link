package testing.uoloweb.Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writefile 
{
	 File f;
	 FileWriter fw;
	 BufferedWriter bw;
	 
	 public writefile(String path) throws IOException
	 {
		 f = new File("../Uolo_Web/"+path+".txt");
		 fw = new FileWriter(f);
		 bw = new BufferedWriter(fw);
	 }

	public void textfile(String s) throws IOException
	{
		bw.newLine();
		bw.write(s);
		 
		
	}

}
