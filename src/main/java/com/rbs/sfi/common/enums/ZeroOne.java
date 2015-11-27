package com.rbs.sfi.common.enums;

<<<<<<< HEAD
=======
/**
 * Created by BS102-Saif on 10/6/2015.
 */
>>>>>>> e912010d368d8762be8ad23bccd8380bd6831f37
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
