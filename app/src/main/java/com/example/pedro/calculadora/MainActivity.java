package com.example.pedro.calculadora;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_table_layout);
    }
    private  EditText instEditText;
    private int acumulador=0,acumuladorMult=1;
    private String concatenador="" , ultimaOperacionString="";;
    /**
     *
     * @param view un componente View que contiene a todos los componentes para interfces de usuario, entre ellos estan los botones, cajas
     * de texto, layouts, etc
     */
    public void escribirNumero(View view) {
        switch (view.getId()) {
            case (R.id.button1):
                System.out.println("boton 1 pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="1";
                instEditText.setText(concatenador);

                break;
            case (R.id.button2):
                System.out.println("button 2  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="2";
                instEditText.setText(concatenador);
                break;
            case (R.id.button3):
                System.out.println("button 3  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="3";
                instEditText.setText(concatenador);
                break;
            case (R.id.button4):
                System.out.println("button 4  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="4";
                instEditText.setText(concatenador);
                break;
            case (R.id.button5):
                System.out.println("button 5  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="5";
                instEditText.setText(concatenador);
                break;
            case (R.id.button6):
                System.out.println("button 6  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="6";
                instEditText.setText(concatenador);
                break;
            case (R.id.button7):
                System.out.println("button 7  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="7";
                instEditText.setText(concatenador);
                break;
            case (R.id.button8):
                System.out.println("button 8  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="8";
                instEditText.setText(concatenador);
                break;
            case (R.id.button9):
                System.out.println("button 9  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="9";
                instEditText.setText(concatenador);
                break;
            case (R.id.buttonCero):
                System.out.println("button 0  pressed");
                instEditText =(EditText)findViewById(R.id.editText);
                concatenador+="0";
                instEditText.setText(concatenador);
                break;
        }
    }

    public void suma(View view){

        acumulador+= Integer.parseInt(instEditText.getText().toString());
        System.out.println("suma:"+acumulador);
        instEditText.setText("");
        concatenador="";
        ultimaOperacionString="suma";
    }
    public void resta (View view){
        //double acumuladorResta=
        acumulador= Integer.parseInt(instEditText.getText().toString());
        System.out.println("resta:"+acumulador);
        instEditText.setText("");
        concatenador="";
        ultimaOperacionString="resta";
    }
    public void multiplicacion  (View view){

        acumuladorMult*= Integer.parseInt(instEditText.getText().toString());
        System.out.println("multiplicacion:"+acumuladorMult);
        instEditText.setText("");
        concatenador="";
        ultimaOperacionString="multiplicacion";
    }
    public void division (View view){
        acumulador/= Integer.parseInt(instEditText.getText().toString());
        instEditText.setText("");
        concatenador="";
        ultimaOperacionString="division";
    }
    public void igual(View view){
        ultimaOperacion(ultimaOperacionString,Integer.parseInt(instEditText.getText().toString()));

        concatenador="";
        ultimaOperacionString="";
        acumulador=0;
        acumuladorMult=1;

    }
    public void del (View view){
//        eliminar el ultimo valor de la cadena de texto y volver a mostrar en pantalla
        int tamanioString=instEditText.length();
        if(instEditText.length()>0){
            String substring = instEditText.getText().toString().substring(0,tamanioString-1);
            instEditText.setText("");
            instEditText.setText(substring);
            concatenador=substring;
        }
//comentario
    }
    public void ultimaOperacion(String operacion, double numero){
        double resultado;
        switch (operacion){
            case ("suma"):
                suma(instEditText);

                break;
            case ("resta"):
                resta(instEditText);
                instEditText.setText(String.valueOf(acumulador));
                break;
            case ("multiplicacion"):
                multiplicacion(instEditText);
                instEditText.setText(String.valueOf(acumuladorMult));
                break;
            case ("division"):
                division(instEditText);
                instEditText.setText(String.valueOf(acumulador));
                break;
        }



    }
}
