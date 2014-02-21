package org.jooq.conf;

public class SettingsExtended {

	private boolean idGenerated;

	/**
	 * Constructor with default values
	 */
	public SettingsExtended() {
		this.idGenerated = true;
	}

	/**
	 * @return True if the new rows should contains an auto-generated ID 
	 */
	public boolean isIdGenerated() {
		return idGenerated;
	}

	/**
	 * @param idGenerated Whether the new rows should contains an auto-generated ID
	 */
	public void setIdGenerated(boolean idGenerated) {
		this.idGenerated = idGenerated;
	} 

}
