package com.te.standardprograms;

public class RevereseAString {

	public static String reverseastring(String str) {

		StringBuilder build = new StringBuilder(str);
		build.reverse();
		return build.toString();
	}

}
