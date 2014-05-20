package org.jooq.impl;

import java.util.Random;

import org.jooq.IdGenerator;

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
	
	private static Long generateLong() {
		return RANDOM.nextLong();
	}
	
	private static String generateString() {
		return String.valueOf(RANDOM.nextLong());
	}

}
