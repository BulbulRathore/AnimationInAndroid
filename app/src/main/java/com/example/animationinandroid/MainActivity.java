package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txthelloworld;
    private TextView txthelloworld1;
    private boolean isHelloworldShowing;
    private TextView txtAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthelloworld = findViewById(R.id.txthelloworld);
        txthelloworld1 = findViewById(R.id.txthelloworld1);
        txtAndroid = findViewById(R.id.txtAndroid);
        txthelloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
//                Log.i("Tag", "hello world");
                if (!isHelloworldShowing){
                    txthelloworld.animate().alpha(0f).setDuration(3000);
                txthelloworld1.animate().alpha(1f).setDuration(3000);
                isHelloworldShowing = true;
               } else{
                    txthelloworld1.animate().alpha(0f).setDuration(3000);
                    txthelloworld.animate().alpha(1f).setDuration(3000);
                    isHelloworldShowing = false;
                }
            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txtAndroid.animate().translationX(-3000).setDuration(2000);
                //txtAndroid.animate().translationY(-3000).setDuration(2000);
                txtAndroid.animate().translationXBy(300).setDuration(2000);
            }
        });
    }


}
