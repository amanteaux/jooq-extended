package org.jooq;

import org.jooq.impl.DefaultConfiguration;

public class DefaultConfigurationExtended extends DefaultConfiguration implements ConfigurationExtended {

	private static final long serialVersionUID = 702637184268712267L;
	
	private final IdGenerator idGenerator = new DefaultIdGenerator(); 

	@Override
	public IdGenerator idGenerator() {
		return idGenerator;
	}

}
