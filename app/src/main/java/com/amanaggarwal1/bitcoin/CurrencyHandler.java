package com.amanaggarwal1.bitcoin;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyHandler {

    private int currentValue ;

    public static CurrencyHandler CurrencyHandler(JSONObject jsonObject){

        try {
            CurrencyHandler currencyHandler = new CurrencyHandler();
            currencyHandler.currentValue = jsonObject.getInt("ask");
            return currencyHandler;
        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
