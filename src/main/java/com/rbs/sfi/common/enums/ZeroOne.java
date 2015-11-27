package com.rbs.sfi.common.enums;

public enum ZeroOne {
    ZERO(0),
    ONE(1);

    private int type;

    ZeroOne(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static String getNameByValue(int code){
        String name="";
        for(ZeroOne zeroOne : ZeroOne.values()){
            if(zeroOne.getType()== code){
                name= zeroOne.name();
            }
        }
        return name;
    }
}
