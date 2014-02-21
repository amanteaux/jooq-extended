package org.jooq;

public interface DAOExtended<R extends TableRecord<R>, P, T> extends DAO<R, P, T> {

	ConfigurationExtended configurationExtended();

}
