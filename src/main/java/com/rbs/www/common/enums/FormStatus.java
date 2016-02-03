package com.rbs.www.common.enums;

public enum FormStatus {
    SUBMITTED("submitted"),
    PENDING("pending");

    private String code;

    FormStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
