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
    TextView contrasena;
    TextView contrasena2;
    final static String TAG = Register.class.getSimpleName();
    static String mensaje = "contrasena incorrecta";
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TextView email = (TextView) findViewById(R.id.editEmail);
        contrasena = (TextView) findViewById(R.id.editPass1);
        contrasena2 = (TextView) findViewById(R.id.editPass2);
         toast = Toast.makeText(this, mensaje, Toast.LENGTH_LONG);
        Button registrar = (Button) findViewById(R.id.buttonRegister);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!contrasena.getText().equals(contrasena2.getText()))
                   toast.show();
            }
        });


        // hides the status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_register);
    }

}
