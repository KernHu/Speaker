// DataBindingBinder.aidl
package com.znt.data;

// Declare any non-default types here with import statements

interface DataBindingBinder {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);


 void getTerminalInit();

 void getTerminalAddbox();

 void getTerminalStatus();

 void getTerminalLastVersion();

 void getTerminalWifi();

 void getTerminalUpdate();

}