package org.example.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UtilityMapIntervalTest {

    UtilityMapInterval utilityMapInterval;

    @Test
    public void evaluateAssignMethod (){
        int keyBegin = 3;
        int keyEnd = 4;
        Map<Integer, String> mapString = new HashMap<>();
        mapString.put(3,"A");
        mapString.put(4,"A");
        mapString.put(1,"A");
        mapString.put(2,"A");
        utilityMapInterval = new UtilityMapInterval(mapString);
        utilityMapInterval.assignValue(keyBegin,keyEnd,"New Value");
        for(int i = keyBegin; i<keyEnd;i++ ){
            Assert.assertEquals("New Value", utilityMapInterval.getMapValue().get(keyBegin));
        }

    }

    @Test
    public void evaluateAssignMethodWrongIndex (){
        boolean verification = false;
        try{

            int keyBegin = 4;
            int keyEnd = 3;
            Map<Integer, String> mapString = new HashMap<>();
            mapString.put(3,"A");
            mapString.put(4,"A");
            mapString.put(1,"A");
            mapString.put(2,"A");
            utilityMapInterval = new UtilityMapInterval(mapString);
            utilityMapInterval.assignValue(keyBegin,keyEnd,"New Value");
        }
        catch (IllegalArgumentException e){
            verification = true;
        }
        Assert.assertEquals(true, verification);

    }
}