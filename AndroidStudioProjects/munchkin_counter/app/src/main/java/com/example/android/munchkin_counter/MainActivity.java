package com.example.android.munchkin_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View player1_level_view = findViewById(R.id.player1_level);
        View player2_level_view = findViewById(R.id.player2_level);
        View player1_damage_view = findViewById(R.id.player1_damage);
        View player2_damage_view = findViewById(R.id.player1_damage);
        Button player1_level_sub_button = findViewById(R.id.p1_level_sub);
        Button player2_level_sub_button = findViewById(R.id.p2_level_sub);
        Button player1_level_add_button = findViewById(R.id.p1_level_add);
        Button player2_level_add_button = findViewById(R.id.p2_level_add);
        Button player1_damage_sub_button = findViewById(R.id.p1_damage_sub);
        Button player2_damage_sub_button = findViewById(R.id.p2_damage_sub);
        Button player1_damage_add_button = findViewById(R.id.p1_damage_add);
        Button player2_damage_add_button = findViewById(R.id.p2_damage_add);
        int player1_level = 1;
        int player2_level = 1;
        int player1_damage;
        int player2_damage;
    }

}
