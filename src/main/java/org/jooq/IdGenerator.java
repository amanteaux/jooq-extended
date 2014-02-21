package org.jooq;

public interface IdGenerator {
	
	public<T> T generate(Class<T> clazz);

}
