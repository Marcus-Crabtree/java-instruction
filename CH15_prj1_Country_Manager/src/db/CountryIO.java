package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {

	// This class represents I/O to and from our countries.txt
	// we will store a the countries in an ArrayList named countries
	// and will write that list to countries.txt whenever we change the list

	// ref pg481 producttextFile for ex
	private List<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;

	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		getCountries();
	}

	public List<String> getCountries() {
		// only read the countries.txt file if countries is null
		if (countries == null) {
			countries = new ArrayList<>();
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
					// read countries from file into arrayList
					String line = in.readLine();
					while (line != null) {
						countries.add(line);
						line = in.readLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				// create the file
				try {
					Files.createFile(countriesPath);
					System.out.println("** | countries file created!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return countries;

	}

	public boolean saveCountries() {
		boolean success = false;
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
			//write all countries from our list to the file
			for(String country: countries) {
				out.println(country);
			}
			success = true;
		} catch (IOException e) {

			e.printStackTrace();
		}
		return success;
	}

	public void addCountry(String country) {
		countries.add(country);
		saveCountries();
		
		
	}





}
