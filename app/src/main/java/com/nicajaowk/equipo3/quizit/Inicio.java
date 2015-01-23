package com.nicajaowk.equipo3.quizit;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;


public class Inicio extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
*/
        // hides the status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_inicio);
    }

    public void goToRegister(View buttonReg){
        Intent j = new Intent(buttonReg.getContext(), Register.class);
        startActivity(j);
    }
}
