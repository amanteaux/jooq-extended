package org.jooq;

import org.jooq.conf.SettingsExtended;

public interface ConfigurationExtended extends Configuration {

    // -------------------------------------------------------------------------
    // Getters
    // -------------------------------------------------------------------------
	
	/**
	 * @return The IdGenerator used to generate new IDs, see {@link SettingsExtended#isIdGenerated()}
	 */
	IdGenerator idGenerator();

	SettingsExtended settingsExtended();
	
    // -------------------------------------------------------------------------
    // Setters
    // -------------------------------------------------------------------------
	
	ConfigurationExtended set(SettingsExtended settingsExtended);
	
}
