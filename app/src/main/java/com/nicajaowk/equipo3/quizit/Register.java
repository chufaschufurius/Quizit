package com.nicajaowk.equipo3.quizit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Register extends ActionBarActivity {
    TextView email;
    TextView contrasena;
    TextView contrasena2;
    static String mensajeContrasenaMala = "contrasena incorrecta";
    static String mensajeCamposVacios = "Faltan campos por rellenar";
    Toast toastContr;
    Toast toastCamposVacios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        email = (TextView) findViewById(R.id.editEmail);
        contrasena = (TextView) findViewById(R.id.editPass1);
        contrasena2 = (TextView) findViewById(R.id.editPass2);
        toastContr = Toast.makeText(this, mensajeContrasenaMala, Toast.LENGTH_LONG);
        toastCamposVacios= Toast.makeText(this, mensajeCamposVacios, Toast.LENGTH_LONG);


        Button registrar = (Button) findViewById(R.id.buttonRegister);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().equals("") ||contrasena.equals("") || contrasena2.equals("") )
                    toastCamposVacios.show();
                else if(!contrasena.getText().equals(contrasena2.getText()))
                    toastContr.show();

            }
        });


        // hides the status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_register);
    }

}
