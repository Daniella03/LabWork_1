package com.example.calculator_lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void handleClickSummation(View view) {//setting listener on the summation button

        //get link to the TextViews
        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        //check values if the are numbers by regulars
        if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
            // adding
            resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) + Double.parseDouble(secondValue.getText().toString())));
        }
        else {//if values are not numbers
            resultOutput.setText("Здесь можно вводить только цифры");
        }
    }

    public void handleClickSubtraction(View view) {

        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
            // subtraction
            resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) - Double.parseDouble(secondValue.getText().toString())));
        }
        else {
            resultOutput.setText("Здесь можно вводить только цифры");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstValue = findViewById(R.id.firstValue);
        final TextView secondValue = findViewById(R.id.secondValue);
        final TextView resultOutput = findViewById(R.id.resultOutput);

        Button multiplication = findViewById(R.id.multiplication);
        Button division = findViewById(R.id.division);

        multiplication.setOnClickListener(l -> { //setting listener on the multiplication button by the View.setOnClickListener() method
            if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
                // multiplication
                resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) * Double.parseDouble(secondValue.getText().toString())));
            }
            else {
                resultOutput.setText("Здесь можно вводить только цифры");
            }
        });

        division.setOnClickListener(l -> {
            if (firstValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+") && secondValue.getText().toString().matches("^[-+]?[0-9]*[.]?[0-9]+")) {
                if (secondValue.getText().toString().matches("[0]")) {
                    resultOutput.setText("На ноль делить нельзя");
                }
                else {
                    // division
                    resultOutput.setText(String.valueOf(Double.parseDouble(firstValue.getText().toString()) / Double.parseDouble(secondValue.getText().toString())));
                }
            }
            else {
                resultOutput.setText("Здесь можно вводить только цифры");
            }
        });
    }
}