package coreJava.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamWithFilter {
	public static void main(String[] args) {

		try {
			Stream<String> dataStream = Files.lines(Paths.get("files/stockDataCsv.txt"));

			dataStream.map(data -> data.split(",")).filter(index -> index.length > 3)
					.filter(indexZero -> indexZero[0].startsWith("A"))
					.filter(indexValue->Integer.parseInt(indexValue[1].trim())>15)
					.forEach(data -> System.out.println(data[0] + " " + data[2] + " " + data[3]));
			dataStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
