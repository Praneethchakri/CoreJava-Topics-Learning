package solid.principle.examples.singleResponsibilityPrinciple;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaveFunctionality {
	
	FileWriter fw = null;
	public void fileSave(UserDetails_After_SRP object) {
		try {
		fw 	= new FileWriter(object.email.concat(".txt"));
			fw.write("PraneethCharkvarthi Diguvapalem");
			fw.write("praneeth.chakri26@gmail.com");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
