package ui;

import java.io.*;
import java.nio.file.*;

public class FilesApp {

	public static void main(String[] args) throws IOException {
		// p.463 create directory and file

		String dirString = "C:/temp";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("Directory created!");
		} else {
			System.out.println("directory " + dirString + " already exists.");

		}

		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("Create a file");
			Files.createFile(filePath);

		} else {
			System.out.println("File already exists");
		}
		System.out.println("File name:   " + filePath.getFileName());
		System.out.println("Absolute Path:   " + filePath.toAbsolutePath());
		System.out.println("Is Writable:   " + Files.isWritable(filePath));

		// display files in a directory
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) { // confirming is directory
			System.out.println("Directory: " + dirPath.toAbsolutePath());
			System.out.println("Files");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p : dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("     " + p.getFileName());
				}
			}
		}

		// p.467 write and read data
		// open an output stream
		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();
		// write in a file
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
		out.println("java\tMurach's Java Programming\t57.50");
		// close output stream
		out.close();

		// read data form a file
		BufferedReader in = new BufferedReader(new FileReader(productsFile));

		System.out.println("read data from the file...");
		String line = in.readLine();
		System.out.println(line);
		
		//close input stream
		in.close();

	
	
	
	
	
	
	
	
	
	
	
	}

}
