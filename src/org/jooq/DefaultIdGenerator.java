package org.jooq;

import java.util.Random;

/**
 * Generate unique IDs
 * @author amanteaux
 *
 */
public class DefaultIdGenerator implements IdGenerator {
	
	private static final Random RANDOM = new Random(System.currentTimeMillis());

	@SuppressWarnings("unchecked")
	@Override
	public <T> T generate(Class<T> clazz) {
		if(clazz == Long.TYPE || clazz == Long.class) {
			return (T) generateLong();
		}
		else if(clazz == String.class) {
			return (T) generateString();
		}
		throw new IllegalArgumentException(clazz.getName() + " is not managed by the default idGenerator");
	}

	// generators
	
	public static Long generateLong() {
		return RANDOM.nextLong();
	}
	
	public static String generateString() {
		return String.valueOf(RANDOM.nextLong());
	}


}
