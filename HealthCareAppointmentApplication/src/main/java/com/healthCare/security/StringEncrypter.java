package com.healthCare.security;

public class StringEncrypter {
	public static final int shiftKey = 5;

	public static String encrypt(String plainText) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < plainText.length(); i++) {
			if (Character.isUpperCase(plainText.charAt(i))) {
				char ch = (char) (((int) plainText.charAt(i) + shiftKey - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) plainText.charAt(i) + shiftKey - 97) % 26 + 97);
				result.append(ch);
			}

		}
		return result.toString();
	}
	//Check MD5 Algorithm (AES256)

	public static String decrypt(String cipherText) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < cipherText.length(); i++) {
			if (Character.isUpperCase(cipherText.charAt(i))) {
				char ch = (char) (((int) cipherText.charAt(i) - shiftKey - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) cipherText.charAt(i) - shiftKey - 97) % 26 + 97);
				result.append(ch);
			}

		}
		return result.toString();
	}
}
