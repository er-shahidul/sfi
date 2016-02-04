package com.rbs.www.common.modules.validator;

import java.util.Collection;

public final class ValidationHelper {
    public static boolean isTruthy(Boolean bool) {
        return bool != null && bool;
    }

    public static boolean isTruthy(Boolean parent, Boolean child) {
        return isTruthy(parent) && isTruthy(child);
    }

    public static boolean isEmptyCollection(Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
