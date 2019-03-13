package com.example.teddybear.calculadorav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.editText_Numero1);
        numero2 = (EditText) findViewById(R.id.editText_Numero2);
        resultado = (TextView) findViewById(R.id.textView_Resultado);
    }

    public void sumaOnclick(View view){
        try{
            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1+N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);
        }catch (Exception e){
            System.out.println("Suma error: \n"+e.getMessage());
        }
    }

    public void restaOnclick(View view){
        try{
            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1-N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);
        }catch (Exception e){
            System.out.println("Resta error: \n"+e.getMessage());
        }
    }

    public void divisionOnclick(View view){
        try{
            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1/N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);
        }catch (Exception e){
            System.out.println("Division error: \n"+e.getMessage());
        }
    }

    public void multiplicacionOnclick(View view){
        try{
            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1*N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);
        }catch (Exception e){
            System.out.println("Multiplicacion error: \n"+e.getMessage());
        }
    }

    public void moduloOnclick(View view){
        try{
            float N1 = Float.parseFloat(numero1.getText().toString());
            float N2 = Float.parseFloat(numero2.getText().toString());
            float R = N1%N2;
            System.out.println("Resultado: "+R);
            String result = "Resultado: "+R;
            resultado.setText(result);
        }catch (Exception e){
            System.out.println("Modulo error: \n"+e.getMessage());
        }
    }
}
