package com.semillero.pruebaunomvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.semillero.pruebaunomvp.MVP.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    EditText etLeerPalabra;
    TextView muestraSalida;
    TextView salidaMuestra;
    Button btnAgregar;
    List<String> listaPlabras = new ArrayList<>();
//    Integer contador = 1;
//    String cadena="";
    String cadena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        etLeerPalabra = findViewById( R.id.etLeerPalabra );
        muestraSalida = findViewById( R.id.entradaMuestra);
        salidaMuestra = findViewById( R.id.salidaMuestra);

        btnAgregar = findViewById( R.id.btnAgregar );




        btnAgregar.setOnClickListener( new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {


                listaPlabras.add(etLeerPalabra.getText().toString());

                for (int i = 0; i < listaPlabras.size(); i++){
                    if (i ==0){
                        cadena =listaPlabras.get( i ) + "\n ";
                    }else if (i == listaPlabras.size()){
                        cadena = cadena + listaPlabras.get( i ) + "\n ";
                    }else{
                        cadena = (cadena + listaPlabras.get( i ) ) + "\n ";
                    }
                    etLeerPalabra.setText( "" );
                    muestraSalida.setText(cadena);

                }

                for (int i = 0; i < listaPlabras.size(); i++){
                    int cont = i;

                    if (i ==0){
                        cadena =  (cont + 1)+ listaPlabras.get( i ) +  "\n ";
                    }else if (i == listaPlabras.size()){
                        cadena = cadena + listaPlabras.get( i ) + "\n ";
                    }else{
                        cadena = (cadena +(cont + 1)+ listaPlabras.get( i ) ) + "\n ";
                    }

                    etLeerPalabra.setText("");
                    salidaMuestra.setText(cadena);

                }


//
//                cadena = cadena + contador+ etLeerPalabra.getText().toString()+"\n";
//                contador++;
//                salidaMuestra.setText( cadena );
            }

        } );

}



}








