package com.example.android.munchkin_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    /**
     * declare and initialize global variables
     */
    int player1_level = 1;
    int player2_level = 1;
    int player1_damage_bonus = 0;
    int player2_damage_bonus = 0;
    int player1_damage_total = player1_level;
    int player2_damage_total = player2_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * increases player 1's level by 1
     */
    public void increment_level_player1(View view) {
        if (player1_level > 0 && player1_level < 10) {
            player1_level += 1;
            show_player1_level();
            show_player1_damage_total();
            if (player1_level == 10) {
             //   player1_win();
            }
        }
    }
    /**
     * increases player 2's level by 1
     */
    public void increment_level_player2(View view) {
        if (player2_level > 0 && player2_level < 10) {
            player2_level += 1;
            show_player2_level();
            show_player2_damage_total();
            if (player2_level == 10) {
              //  player2_win();
            }
        }
    }
    /**
     * decreases player 1's level by 1
     */
    public void decrement_level_player1(View view) {
        if (player1_level > 1 && player1_level < 10) {
            player1_level -= 1;
            show_player1_level();
            show_player1_damage_total();
        }
    }
    /**
     * decreases player 2's level by 1
     */
    public void decrement_level_player2(View view) {
        if (player2_level > 1 && player2_level < 10) {
            player2_level -= 1;
            show_player2_level();
            show_player2_damage_total();
        }
    }
    /**
     * increases player 1's bonus damage by 1
     */
    public void increment_damage_bonus_player1(View view) {
        player1_damage_bonus += 1;
        show_player1_damage_bonus();
        show_player1_damage_total();
    }
    /**
     * increases player 1's damage by 1
     */
    public void increment_damage_bonus_player2(View view) {
        player2_damage_bonus += 1;
        show_player2_damage_bonus();
        show_player2_damage_total();
    }
    /**
     * decreases player 1's damage by 1 and updates respective textviews
     */
    public void decrement_damage_bonus_player1(View view) {
        if (player1_damage_bonus > 0) {
            player1_damage_bonus -= 1;
            show_player1_damage_bonus();
            show_player1_damage_total();
        }
    }
    /**
     * decreases player 2's damage by 1 and updates respective textviews
     */
    public void decrement_damage_bonus_player2(View view) {
        if (player2_damage_bonus > 0) {
            player2_damage_bonus -= 1;
            show_player2_damage_bonus();
            show_player2_damage_total();
        }
    }
    /**
     * displays player 1's total damage
     */
    public void show_player1_damage_total() {
        player1_damage_total = player1_level + player1_damage_bonus;
        TextView player1_damage_total_textview = findViewById(R.id.player1_damage_total);
        player1_damage_total_textview.setText(String.valueOf(player1_damage_total));
    }
    /**
     * displays player 2's total damage
     */
    public void show_player2_damage_total() {
        final String TAG = "MyActivity";
        Log.v(TAG,"p2 lv = " + player2_level + " p2 bonus = " + player2_damage_bonus + "p2 total = " + player2_damage_total);
        player2_damage_total = player2_level + player2_damage_bonus;
        TextView player2_damage_total_textview = findViewById(R.id.player2_damage_total);
        player2_damage_total_textview.setText(String.valueOf(player2_damage_total));
    }
    /**
     * displays player 1's bonus damage
     */
    public void show_player1_damage_bonus() {
        TextView player1_damage_bonus_textview = findViewById(R.id.player1_damage_bonus);
        player1_damage_bonus_textview.setText(String.valueOf(player1_damage_bonus));
    }
    /**
     * displays player 1's bonus damage
     */
    public void show_player2_damage_bonus() {
        TextView player2_damage_bonus_textview = findViewById(R.id.player2_damage_bonus);
        player2_damage_bonus_textview.setText(String.valueOf(player1_damage_bonus));
    }
    /**
     * displays player 1's level
     */
    public void show_player1_level() {
        TextView player1_level_textview = findViewById(R.id.player1_level);
        player1_level_textview.setText(String.valueOf(player1_level));
    }
    /**
     * displays player 1's level
     */
    public void show_player2_level() {
        TextView player2_level_textview = findViewById(R.id.player2_level);
        player2_level_textview.setText(String.valueOf(player2_level));
    }
    /**
     * reset player 1 onClick
     */
    public void reset_p1_onClick(View view){
        reset_p1();
    }
    /**
     * reset player 2 onClick
     */
    public void reset_p2_onClick(View view){
        reset_p2();
    }
    /**
     * reset both players onClick
     */
    public void reset_both_onClick(View view){
        reset_p1();
        reset_p2();
    }
    /**
     * reset player 1
     */
    public void reset_p1(){
        player1_damage_bonus = 0;
        player1_level = 1;
        show_player1_level();
        show_player1_damage_bonus();
        show_player1_damage_total();
    }
    /**
     * reset player 2
     */
    public void reset_p2(){
        player2_damage_bonus = 0;
        player2_level = 1;
        show_player2_level();
        show_player2_damage_bonus();
        show_player2_damage_total();
    }
    /**
     * player 1 wins
     */
    public void win_p1(){
        //toast?
    }
}
