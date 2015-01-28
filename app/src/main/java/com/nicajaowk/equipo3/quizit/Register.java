package com.nicajaowk.equipo3.quizit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;


public class Register extends ActionBarActivity {
    EditText email = null;
    EditText contrasena;
    EditText contrasena2;
    static String mensajeContrasenaMala = "contrasena incorrecta";
    static String mensajeCamposVacios = "Faltan campos por rellenar";
    static String mensajeC = "EXITO GARRAFAL, NICO PAGAFANTAS!!";
    Toast toastContr;
    Toast toastCamposVacios;
    Toast mensaje;
    Log log;
    Button register;
    private static final String TAG="activity_register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = (EditText) findViewById(R.id.editEmail);
        contrasena = (EditText) findViewById(R.id.editPass1);
        contrasena2 = (EditText) findViewById(R.id.editPass2);
        register= (Button) findViewById(R.id.buttonRegister);
        toastContr = Toast.makeText(this, mensajeContrasenaMala, Toast.LENGTH_LONG);
        toastCamposVacios= Toast.makeText(this, mensajeCamposVacios, Toast.LENGTH_LONG);
        mensaje= Toast.makeText(this, mensajeC, Toast.LENGTH_LONG);
        // hides the status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onClickRegister(View v) {
        String usuario=email.getText().toString();
        String contrasenia=contrasena.getText().toString();
        String contrasenia2=contrasena2.getText().toString();
//        Log.d(TAG, "USUARIO="+email.getText().toString()+"CONTRASENIA="+contrasena.getText().toString()+"CONTRASENIA2="+contrasena2.getText().toString());
        if("".equals(usuario) ||"".equals(contrasenia) || "".equals(contrasenia2)){
            toastCamposVacios.show();
//            Log.d(TAG, "USUARIO="+email.getText().toString()+"CONTRASENIA="+contrasena.getText().toString()+"CONTRASENIA2="+contrasena2.getText().toString());
//            Log.d(TAG, "campos VACIOS");
        }
        else{
            if(!contrasenia.equals(contrasenia2)){
                toastContr.show();
//                Log.d(TAG, "USUARIO="+email.getText()+"CONTRASENIA="+contrasena.getText()+"CONTRASENIA2="+contrasena2.getText());
//                Log.d(TAG, "contrasenias INCORRECTAS");
            }
            else{
                mensaje.show();
                Log.d(TAG, "BIEEN");
                ParseObject newUser= new ParseObject("User");
                newUser.put("user",usuario);
                newUser.put("password",contrasenia);
                newUser.saveInBackground();
                startActivity(new Intent(this, Inicio.class));

            }
        }
    }
    public boolean validaUser(String usuario){
        ParseQuery<ParseObject> query= ParseQuery.getQuery("user");
        query.whereEqualTo("user", usuario);
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> parseObjects, ParseException e) {
                if(e==null)
                    Log.d(TAG,"Se establecio la conexion");
                else
                    Log.d(TAG, "Excepcion!!");
            }
        });
//        if();
        return false;
    }
}
