package com.bettercloud.bigtable.orm;

import java.util.Arrays;

public class Key<T extends Entity> {

    protected final byte[] key;

    public Key(byte[] key) {
        this.key = Arrays.copyOf(key, key.length);
    }

    public byte[] toBytes() {
        return this.key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key<?> key1 = (Key<?>) o;
        return Arrays.equals(key, key1.key);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(key);
    }
}
