package com.vagdeviitstudents.naveen.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		String sentence = "I love my country.Please call me everyday ,please love me and my country .";
		Map wordCount = countWords(sentence);
		for (Object word : wordCount.keySet()) {
			System.out.println(word + " = " + wordCount.get(word));
		}
	}

	public static Map countWords(String sentence) {
		Scanner scanner = new Scanner(sentence);
		Map wordCount = new HashMap();

		while (scanner.hasNext()) {
			String word = scanner.next();

			if (wordCount.containsKey(word)) {
				int count = (int) wordCount.get(word);
				wordCount.put(word, count + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		return wordCount;
	}
}
