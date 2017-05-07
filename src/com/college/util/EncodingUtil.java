package com.college.util;

import org.apache.commons.codec.binary.Base64;

public class EncodingUtil {

	public static String encryptPassword(String pwd) {
		byte[] encodedBytes = Base64.encodeBase64(pwd.getBytes());
		return new String(encodedBytes);
	}

	public static String decryptPassword(String pwd) {
		byte[] decodedBytes = Base64.decodeBase64(pwd.getBytes());
		return new String(decodedBytes);
	}

	/*public static void main(String[] args) {
		String encode = encryptPassword("ramesh");
		System.out.println("encrepted code \t "+encode);
		String decrpt = decryptPassword(encode);
		System.out.println("decripted code\t" + decrpt);
	}*/
}
