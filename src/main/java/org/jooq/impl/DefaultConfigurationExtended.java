package org.jooq.impl;

import org.jooq.ConfigurationExtended;
import org.jooq.IdGenerator;
import org.jooq.conf.SettingsExtended;
import org.jooq.impl.DefaultConfiguration;

public class DefaultConfigurationExtended extends DefaultConfiguration implements ConfigurationExtended {

	private static final long serialVersionUID = 702637184268712267L;
	
	private final IdGenerator idGenerator;
	
	private SettingsExtended settingsExtended;
	

	public DefaultConfigurationExtended() {
		this(new DefaultIdGenerator(), new SettingsExtended());
	}
	
	private DefaultConfigurationExtended(IdGenerator idGenerator, SettingsExtended settingsExtended) {
		this.idGenerator = idGenerator;
		this.settingsExtended = settingsExtended;
	}

	@Override
	public IdGenerator idGenerator() {
		return idGenerator;
	}

	@Override
	public SettingsExtended settingsExtended() {
		return settingsExtended;
	}

	@Override
	public ConfigurationExtended set(SettingsExtended settingsExtended) {
		this.settingsExtended = settingsExtended == null ? new SettingsExtended() : settingsExtended;
		return this;
	}

}
