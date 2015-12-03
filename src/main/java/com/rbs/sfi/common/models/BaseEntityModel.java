package com.rbs.sfi.common.models;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseEntityModel implements IModel {
    @Override
    public abstract Integer getId();

    protected <T> void addAll(Set<T> dest, Set<T> source) {
        if (source == null) {
            dest = null;
        } else {
            if (dest == null) dest = new HashSet<T>();
            dest.clear();
            dest.addAll(source);
        }
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof BaseEntityModel
                && ((BaseEntityModel) o).getId().equals(this.getId()));
    }
}
