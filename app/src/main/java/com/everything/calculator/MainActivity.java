package com.everything.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etN2;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber1 = findViewById(R.id.etNumber1);
        etN2 = findViewById(R.id.etN2);
        btnDivide = findViewById(R.id.btnDivide);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPlus = findViewById(R.id.btnPlus);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumber1.getText().toString());
                int numberTwo = Integer.parseInt(etN2.getText().toString());
                Plus(numberOne,numberTwo);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumber1.getText().toString());
                int numberTwo = Integer.parseInt(etN2.getText().toString());
                Minus(numberOne,numberTwo);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumber1.getText().toString());
                int numberTwo = Integer.parseInt(etN2.getText().toString());
                Multiply(numberOne,numberTwo);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumber1.getText().toString());
                int numberTwo = Integer.parseInt(etN2.getText().toString());
                Divide(numberOne,numberTwo);
            }
        });
    }

    private int Plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    private int Minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    private int Multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    private int Divide(int numberOne, int numberTwo){
        if (numberTwo==0){
            return 0;
        }
        else{
            return numberOne / numberTwo;
        }
    }
}
