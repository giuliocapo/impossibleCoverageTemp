package com.example.impossiblecoveragetemp;

public class MemorySizeControl{

    public  static String MemorySize(){
        String s = "" ;

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Free memory (bytes): " + maxMemory);
        long standardRam = 160000000 ;
        if (maxMemory > standardRam){
            s = "You can start the application";
        }
        else {
            s = "You can start the lite version of application";
        }
        System.out.println(standardRam);
        System.out.println(s);
        return s;
    }
}
