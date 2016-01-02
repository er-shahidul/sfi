package com.rbs.www.common.enums;

public enum UserGroupType {
    USER("USER"),
    GENERAL("GENERAL"),
    ADMIN("ADMIN");

    String userGroupType;

    private UserGroupType(String userGroupType) {
        this.userGroupType = userGroupType;
    }

    public String getUserGroupType() {
        return userGroupType;
    }
}
