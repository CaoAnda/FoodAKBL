package com.example.foodakbl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    protected void toast(String str){
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, recipe.class);
        startActivity(intent);
        // TODO: 横向滚动选择栏

        Button bt_play;
        bt_play=(Button)findViewById(R.id.play);
        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                utils.new_player(MainActivity.this, R.raw.beat_eggs);
            }
        });
    }
}