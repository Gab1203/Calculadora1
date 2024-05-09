package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public  EditText value1;
    public EditText value2;
    public TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText value1 = (EditText)findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);
        TextView result = (TextView)findViewById(R.id.txtPrintResult);
    }




    public void Somar(View view){

        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();

        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double soma =  valor1 + valor2;
        result.setText(String.valueOf(soma));


    }

    public void Subtrair(View view){


        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();

        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double subtracao =  valor1 - valor2;
        result.setText(String.valueOf(subtracao));

    }

    public void Multiplicar(View view){


        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();

        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double multiplicacao =  valor1 * valor2;
        result.setText(String.valueOf(multiplicacao));

    }
    public void Dividir(View view){


        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();

        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double divisao =  valor1 / valor2;
        result.setText(String.valueOf(divisao));

    }

    public void telaDois(View view){
Intent intent = new Intent(MainActivity.this , tela2.class);
startActivity(intent);

    }



}