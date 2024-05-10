package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    }

    public void cleanInputs(){
        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);

        value1.setText("");
        value2.setText("");

    }



public boolean checkValues(){
    EditText value1 = (EditText)findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);

        boolean isCorrect = true;

        try{

          double valor1 =  Double.parseDouble(value1.getText().toString());
          double valor2 =  Double.parseDouble(value2.getText().toString());

        }catch(Exception e){

            isCorrect = false;
        }


        return isCorrect;
}

    @SuppressLint("SetTextI18n")
    public void Somar(View view){

        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);
        TextView result = (TextView) findViewById(R.id.txtPrintResult);
        if(this.checkValues()) {

            String num1 = value1.getText().toString();
            String num2 = value2.getText().toString();

            double valor1 = Double.parseDouble(num1);
            double valor2 = Double.parseDouble(num2);
            double soma = valor1 + valor2;
            result.setText(String.valueOf(soma));

        }else{

result.setText("Insira valores válidos!");

        }
        this.cleanInputs();
    }

    @SuppressLint("SetTextI18n")
    public void Subtrair(View view){
        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);
        TextView result = (TextView) findViewById(R.id.txtPrintResult);
        if(this.checkValues()) {


            String num1 = value1.getText().toString();
            String num2 = value2.getText().toString();

            double valor1 = Double.parseDouble(num1);
            double valor2 = Double.parseDouble(num2);
            double subtracao = valor1 - valor2;
            result.setText(String.valueOf(subtracao));
        }else{
            result.setText("Insira valores válidos!");

        }


        this.cleanInputs();

    }

    @SuppressLint("SetTextI18n")
    public void Multiplicar(View view){

        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);
        TextView result = (TextView) findViewById(R.id.txtPrintResult);
        if(this.checkValues()) {


            String num1 = value1.getText().toString();
            String num2 = value2.getText().toString();

            double valor1 = Double.parseDouble(num1);
            double valor2 = Double.parseDouble(num2);
            double multiplicacao = valor1 * valor2;
            result.setText(String.valueOf(multiplicacao));
        }else {
            result.setText("Insira valores válidos!");
        }

        this.cleanInputs();
    }
    @SuppressLint("SetTextI18n")
    public void Dividir(View view){
        EditText value1 = (EditText) findViewById(R.id.editTextValor1), value2 = (EditText) findViewById(R.id.editTextValor2);
        TextView result = (TextView) findViewById(R.id.txtPrintResult);

        if(this.checkValues() && Double.parseDouble(value2.getText().toString()) != 0 ) {


            String num1 = value1.getText().toString();
            String num2 = value2.getText().toString();

            double valor1 = Double.parseDouble(num1);
            double valor2 = Double.parseDouble(num2);
            double divisao = valor1 / valor2;
            result.setText(String.valueOf(divisao));
        }else{

            result.setText("Insira valores válidos!");
        }


        this.cleanInputs();
    }

    public void telaDois(View view){
Intent intent = new Intent(MainActivity.this , tela2.class);
startActivity(intent);

    }



}