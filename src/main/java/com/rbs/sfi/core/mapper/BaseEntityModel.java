package com.rbs.sfi.core.mapper;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseEntityModel implements IModel {
    public abstract Integer getId();

    protected <T> void addAll(Set<T> to, Set<T> from) {
        if (from == null) {
            to = null;
        } else {
            if (to == null) to = new HashSet<T>();
            to.clear();
            to.addAll(from);
        }
    }
}
