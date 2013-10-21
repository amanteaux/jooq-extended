package org.jooq.impl;

import org.jooq.ConfigurationExtended;
import org.jooq.RecordMapper;
import org.jooq.Table;
import org.jooq.UpdatableRecord;

public abstract class ExtendedDAOImpl<R extends UpdatableRecord<R>, P, T> extends DAOImpl<R, P, T> {

	public ExtendedDAOImpl(final Table<R> table, final Class<P> type) {
		super(table, type);
	}

	protected ExtendedDAOImpl(final Table<R> table, final Class<P> type, final ConfigurationExtended configuration) {
		super(table, type, configuration);
	}
	
	public ConfigurationExtended configurationExtended() {
		return (ConfigurationExtended) configuration();
	}

	// TODO to delete as soon as jOOQ >= 3.2 is used
	public RecordMapper<R, P> mapper() {
		return Utils.configuration(configuration()).recordMapperProvider().provide(getTable().recordType(), getType());
	}
	
	protected abstract void setId(P object, java.lang.Long id);

	public abstract boolean isNew(P object);

	public abstract void save(P object);

}
