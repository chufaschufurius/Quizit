package com.nicajaowk.equipo3.quizit;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;

/**
 * Created by CHUFASCHIN on 28/01/2015.
 */
public class AppMemoryt extends Application {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "NCFX0CqHDFkXHidY44fbhBanCKzk0l4rbU7NW0BJ", "pHD2gqjxkgtEzYBCV3Aqflw8dEKX0StD5Hzbe4yR");
    }
}
