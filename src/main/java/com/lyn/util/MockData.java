package com.lyn.util;

import java.util.Random;

public class MockData {

	private static final int DEFAULT_COUNT_OF_ARRAY = 5;
	private static final int DEFAULT_RANDOM_BOUND = 100;
	private static final int DEFAULT_STRING_LENGTH = 10;

	private static final String LETTERS = "abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static Random random = new Random();

	/**
	 * mock an {@code int} array
	 * 
	 * @return an {@code int} array with random values
	 */
	public static int[] mockIntArray() {
		return mockIntArray(DEFAULT_COUNT_OF_ARRAY);
	}

	/**
	 * mock an {@code int} array using the given array count
	 * 
	 * @param arrayCount
	 * @return an {@code int} array with random values
	 */
	public static int[] mockIntArray(int arrayCount) {
		if (arrayCount <= 0) {
			arrayCount = MockData.DEFAULT_COUNT_OF_ARRAY;
		}

		int[] intArray = new int[arrayCount];

		for (int i = 0; i < arrayCount; i++) {
			intArray[i] = MockData.generateRandomInt();
		}

		return intArray;
	}

	/**
	 * generate {@code int} number using default bound
	 * 
	 * @return a random {@code int} number
	 */
	public static int generateRandomInt() {
		return random.nextInt(DEFAULT_RANDOM_BOUND);
	}

	/**
	 * generate random string
	 * 
	 * @return a random string
	 */
	public static String generateRandomString() {
		return generateRandomString(DEFAULT_STRING_LENGTH);
	}

	/**
	 * generate random string using all letters and the given length
	 * 
	 * @param stringLength
	 * @return a random string
	 */
	public static String generateRandomString(int stringLength) {
		if (stringLength <= 0) {
			stringLength = DEFAULT_STRING_LENGTH;
		}

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < stringLength; i++) {
			stringBuffer.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
		}

		return stringBuffer.toString();
	}

}
