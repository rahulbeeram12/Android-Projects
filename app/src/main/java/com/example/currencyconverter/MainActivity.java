package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.String;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickConvert(View view){
        EditText money = (EditText) findViewById(R.id.editText);

        String amountInRupees = money.getText().toString();

        double amountInRupeesDouble = Double.parseDouble(amountInRupees);

        double amountInDollarsDouble = amountInRupeesDouble/75.66;

        String amountInDollarsString = String.format("%.2f",amountInDollarsDouble);

        Toast.makeText(this, "Rupees "+amountInRupees +" is "+amountInDollarsString+" in Dollars", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
