package com.vcanus.q01;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class BreadFactory {

    public Bread getBread(String breadType) {
        if(breadType == null) {
            return null;
        }

        if (breadType.equals("cream")) {
            return new CreamBread(100, 100 ,200);
        } else if (breadType.equals("sugar")) {
            return new SugarBread(100 ,50, 200);
        } else if (breadType.equals("butter")) {
            return new ButterBread(100, 100, 50);
        }
        return null;
    }

}
