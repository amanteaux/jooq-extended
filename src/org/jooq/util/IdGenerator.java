package org.jooq.util;

import java.util.Random;

/**
 * Generate unique IDs
 * @author amanteaux
 *
 */
public class IdGenerator {
	
	private static final Random RANDOM = new Random(System.currentTimeMillis());
	
	public static long generateLong() {
		return RANDOM.nextLong();
	}
	
	public static String generateString() {
		return String.valueOf(RANDOM.nextLong());
	}

}
