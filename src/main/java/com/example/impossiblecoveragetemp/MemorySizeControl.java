package com.example.impossiblecoveragetemp;

public class MemorySizeControl{

    private MemorySizeControl(){}

    public  static String memorySize(){
        String s = "" ;

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        long standardRam = 160000000 ;
        if (maxMemory > standardRam){
            s = "You can start the application";
        }
        else {
            s = "You can start the lite version of application";
        }
        return s;
    }
}
