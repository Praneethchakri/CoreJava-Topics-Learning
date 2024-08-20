package coreJava.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamData {
	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
//		lines.filter(l -> l.length() > 6).sorted().forEach(System.out::println);
//		lines.close();

		List<String> words = lines.filter(name -> name.contains("th")).sorted().collect(Collectors.toList());
		words.forEach(System.out::println);
		lines.close();

		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
			rows.map(x->x.split(","))
			.forEach(System.out::println);
		
		int count = (int) rows.map(x->x.split(","))
		.filter(y->y.length>3)
		.count();
		rows.close();
		System.out.println(count);

	}
}
