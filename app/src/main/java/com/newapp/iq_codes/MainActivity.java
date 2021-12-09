package com.newapp.iq_codes;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The Main Activity is Splash screen
 * @author Pradepa Sudarshana Atapattu
 * Student RegNo.2115417
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread thread = new Thread() {
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    // after splash screen go to  walkThrough intent

                    startActivity( new Intent(MainActivity.this,walkthrough.class)); // jump to next intent
                }
            }

        };
        thread.start();

    }

}