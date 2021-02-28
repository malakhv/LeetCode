package com.malakhv.leetcode.arrays;


public final class Utils {
	
	public static final String STR_NULL = "NULL";
	
	public static final String STR_EMPTY = "EMPTY";
	
    public static final String CHAR_SPACE = " ";

    public static final String CHAR_DOT = ".";

    public static final String CHAR_COMMA = ",";
    
    public static final String CHAR_EQUAL = "=";
    
    public static final String CHAR_SQUARE_OPEN = "[";
    
    public static final String CHAR_SQUARE_CLOSE = "]";
	
	public static boolean isEmpty(String value) {
		return value == null || value.length() <= 0;
	}
	
	public static String arrayToString(int[] array) {
		if (array == null) return STR_NULL;
		if (array.length <= 0) return STR_EMPTY;
		
		StringBuilder builder = new StringBuilder();
		builder.append(CHAR_SQUARE_OPEN).append(array[0]);
		for (int i = 1; i < array.length; i++) {
			builder.append(CHAR_COMMA).append(array[i]);
		}
		builder.append(CHAR_SQUARE_CLOSE);
		
		return builder.toString();
	}

}
