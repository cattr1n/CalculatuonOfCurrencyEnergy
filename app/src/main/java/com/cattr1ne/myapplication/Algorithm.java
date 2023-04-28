package com.cattr1ne.myapplication;

import android.graphics.drawable.ColorDrawable;

public class Algorithm {

    private final long SPEED_OF_LIGHT = 300_000_000;

    public long absoluteEnergy(String input) {
     String inputMod = "";
     // обработка возможностей ситуации ввода пользователем запятой в числе
        if (input.contains(",")) {
            inputMod = input.replace(",","." ); // замена запятой на точку
        }  else {
            inputMod = input;
        }
        float inputFloat = Float.parseFloat(inputMod);
        return (long) (inputFloat * SPEED_OF_LIGHT * SPEED_OF_LIGHT);

        }

}

