package com.example.myapplication3;

import android.widget.Toast;

public class cal {
    protected float convertCelciusToFahrenheit(Float value) {
        Float ans = (value * 9/5) + 32;
        return ans;
    }
    protected float convertFahrenheitToCelcius(Float value) {
        Float ans = (value - 32) * 5/9;
        return ans;
    }
    protected void onResume() {
        super.onResume();
        btnCalculate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                calculateAnswer();
            }
        });
    }
    private void calculateAnswer() {
        if( TextUtils.isEmpty(temp value)){
            Toast.makeText(context:this, text:"Please add a value",
                    Toast.LENGTH_LONG).show();
            temp value="0.0"
        }
 else{
            if( /* celcius button is checked */ ){

// convert it into Fahrenheit and display the answer
            }
            else{
// convert it into Celcius and display the answer
            }
        }
    }
}
