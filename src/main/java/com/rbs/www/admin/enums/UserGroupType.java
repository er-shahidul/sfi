package com.rbs.www.admin.enums;

public enum UserGroupType {
    USER("USER"),
    ADMIN("ADMIN"),
    SUPER_ADMIN("SUPER_ADMIN");

    String userGroupType;

    private UserGroupType(String userGroupType) {
        this.userGroupType = userGroupType;
    }

    public String getUserGroupType() {
        return userGroupType;
    }
}
