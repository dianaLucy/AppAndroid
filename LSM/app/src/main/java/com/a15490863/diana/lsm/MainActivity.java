package com.a15490863.diana.lsm;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{this.getSupportActionBar().hide();

        }catch(NullPointerException e){

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        b1=(Button) findViewById(R.id.bu);

        b1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intento = new Intent(getApplicationContext(), Menu.class);

                startActivity(intento);
            }

        });



    }
}
