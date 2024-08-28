package coding.practicals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TryCatchFinallyImpl {

	public static void main(String[] args) {
		Stream<String> lines = null;

		try {
			lines = Files.lines(Paths.get("files/wordFile1.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			lines = Stream.empty();
			System.out.println("1 " +lines);
			try {
				if (lines != null)
					System.out.println("2  " +lines);
					lines.close();
			} catch (Exception e) {
				
			} finally {
				lines.close();
			}
		}
	}
}
