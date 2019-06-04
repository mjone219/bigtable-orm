package com.bettercloud.bigtable.orm;

import org.apache.hadoop.hbase.util.Bytes;

public class StringKey<T extends Entity> extends Key<T> {

    @SuppressWarnings("WeakerAccess") // Used by generated Entities
    public StringKey(final String keyString) {
        super(Bytes.toBytes(keyString));
    }

    @Override
    public String toString() {
        return new String(this.key);
    }
}
