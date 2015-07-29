package javaEE;

import java.io.File;

public class GetFilename {
	
	File file = new File("fileWithFilename.txt");
	
	public String getFilename() {
		return file.getName();
	}

	

}
