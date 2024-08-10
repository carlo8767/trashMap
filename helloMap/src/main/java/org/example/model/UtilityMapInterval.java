package org.example.model;

import java.util.Map;

public class UtilityMapInterval {


    private Map<Integer, String> mapValue;

    public UtilityMapInterval(Map<Integer, String> mapValue) {
        this.mapValue = mapValue;
    }


    public Map<Integer, String> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<Integer, String> mapValue) {
        this.mapValue = mapValue;
    }


    public void assignValue(  Integer keyBegin, Integer keyEnd, String value){
        // VERIFICATION MISTAKE
        if(!(keyBegin< keyEnd)){
            throw new IllegalArgumentException();
        }
        else {
            Map<Integer, String> localMap = this.getMapValue();
            // loop just with the keyBegin and keyEnd
            for (int i = keyBegin; i < keyEnd; i++) {
                // replace the old value
                localMap.replace(keyBegin, value);
                keyBegin++;
            }
            this.setMapValue(localMap);
        }
        }
}
