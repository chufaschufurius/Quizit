package com.nicajaowk.equipo3.quizit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;


public class Inicio extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // hides the status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_inicio);
    }

    public void goToRegister(View buttonReg){
        Intent j = new Intent(buttonReg.getContext(), Register.class);
        startActivity(j);
    }
}
