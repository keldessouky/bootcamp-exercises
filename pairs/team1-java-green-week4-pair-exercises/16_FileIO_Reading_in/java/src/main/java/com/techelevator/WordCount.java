package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		int words = 0;
		int sentence = 0;

		File book = new File("alices_adventures_in_wonderland.txt");

		try {
			Scanner scanner = new Scanner(book);

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();
				line = line.replaceAll("  ", " ");
				String[] wordArray = line.split(" ");
				for (String word : wordArray) {
					if (word.contains(".") || word.contains("?") || word.contains("!")) {
						sentence++;

					}
					if (word.equals("")) {
						words--;
					}
					words++;
				}
			}

			scanner.close();

		} catch (FileNotFoundException fileMissing) {

		}

		System.out.println("Word Count: " + words);
		System.out.println("Sentence Count: " + sentence);

	}

}
