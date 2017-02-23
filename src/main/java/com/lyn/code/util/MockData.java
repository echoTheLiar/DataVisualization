package com.lyn.util;

import java.util.Random;

public class MockData {

	private static final int DEFAULT_COUNT_OF_ARRAY = 5;
	private static final int DEFAULT_RANDOM_BOUND = 1000;
	private static final int DEFAULT_STRING_LENGTH = 10;

	private static final String LETTERS = "abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static Random random = new Random();

	/**
	 * mock an {@code int} array
	 * 
	 * @return an {@code int} array with random values
	 */
	public static int[] generateIntArray() {
		return generateIntArray(DEFAULT_COUNT_OF_ARRAY, DEFAULT_RANDOM_BOUND);
	}

	/**
	 * mock an {@code int} array using the given array count and the random
	 * bound
	 * 
	 * @param arrayCount
	 * @param randomBound
	 * @return an {@code int} array with random values
	 */
	public static int[] generateIntArray(int arrayCount, int randomBound) {
		if (arrayCount <= 0) {
			arrayCount = DEFAULT_COUNT_OF_ARRAY;
		}

		int[] intArray = new int[arrayCount];

		for (int i = 0; i < arrayCount; i++) {
			intArray[i] = generateRandomInt(randomBound);
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
	 * generate {@code int} number using the given bound
	 * 
	 * @param randomBound
	 * @return a random {@code int} number
	 */
	public static int generateRandomInt(int randomBound) {
		return random.nextInt(randomBound);
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

	/**
	 * 
	 * @param str
	 * @return {@code true} if the input {@code String} is null or ""
	 */
	public static boolean empty(final String str) {
		return str == null || str.trim().isEmpty();
	}
}
