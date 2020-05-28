package com.bacter.antimosquito;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer  player1, player2, player3, player4, player5, player6, player7, player8,player9;
    private Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mActivity = MainActivity.this;

    }
    public void play1(View view){
        if (player1==null){
            player1=MediaPlayer.create (this,R.raw.eight);
            player1.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player1.pause ();
                }
            });
        }
        player1.start ();
        player1.setLooping (true);
    }
    public void play2(View view) {
        if (player2 == null) {
            player2 = MediaPlayer.create (this,R.raw.ten);
            player2.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player2.pause ();
                }
            });
        }
        player2.start ();
        player2.setLooping (true);
    }

    public void play3(View view) {
        if (player3 == null) {
            player3 = MediaPlayer.create (this,R.raw.tweleve);
            player3.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player3.pause ();
                }
            });
        }
        player3.start ();
        player3.setLooping (true);
    }

    @SuppressLint("SetTextI18n")
    public void play4(View view) {
        if (player4 == null) {
            player4 = MediaPlayer.create (this,R.raw.fourteen);
            player4.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player4.pause ();
                }
            });
        }
        player4.start ();
        player4.setLooping (true);
    }

    public void play5(View view) {
        if (player5 == null) {
            player5 = MediaPlayer.create (this,R.raw.sixteen);
            player5.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player5.pause ();
                }
            });
        }
        player5.start ();
        player5.setLooping (true);
    }

    public void play6(View view) {
        if (player6 == null) {
            player6 = MediaPlayer.create (this,R.raw.seventeen);
            player6.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player6.pause ();
                }
            });
        }
        player6.start ();
        player6.setLooping (true);
    }

    public void play7(View view) {
        if (player7 == null) {
            player7 = MediaPlayer.create (this,R.raw.tweenty);
            player7.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                   player7.pause ();
                }
            });
        }
        player7.start ();
        player7.setLooping (true);
    }
    public void play8(View view) {
        if (player8 == null) {
            player8 = MediaPlayer.create (this,R.raw.tweektyone);
            player8.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player8.pause ();
                }
            });
        }
        player8.start ();
        player8.setLooping (true);
    }
    public void play9(View view) {
        if (player9==null){
            player9=MediaPlayer.create (this,R.raw.twentytwo);
            player9.setOnCompletionListener (new MediaPlayer.OnCompletionListener () {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    player9.pause ();
                }
            });
        }
        player9.start ();
        player9.setLooping (true);
    }

    @Override
    public void onBackPressed( ) {
        AlertDialog.Builder builder = new AlertDialog.Builder (mActivity);
        builder.setIcon (R.drawable.m);
        builder.setTitle ("Are you sure you want to exit?");
        builder.setCancelable (false);
        builder.setPositiveButton ("Yes",new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog,int id) {
                MainActivity.this.finish ();
            }
        });
        builder.setNegativeButton ("No",new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog,int which) {
                dialog.cancel ();
            }
        });
        AlertDialog dialog = builder.create ();
        dialog.show ();
    }
    public void onStop(View v){
        if(this.player1!=null){
            player1.pause ();
            Toast.makeText (this,"8kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player2!=null){
            player2.pause ();
            Toast.makeText (this,"10kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player3!=null){
            player3.pause ();
            Toast.makeText (this,"12kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player4!=null){
            player4.pause ();
            Toast.makeText (this,"14kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player5!=null){
            player5.pause ();
            Toast.makeText (this,"16kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player6!=null){
            player6.pause ();
            Toast.makeText (this,"17kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player7!=null){
            player7.pause ();
            Toast.makeText (this,"20kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player8!=null) {
            player8.pause ();
            Toast.makeText (this,"21kHz Stop",Toast.LENGTH_SHORT).show ();
        }
        if (this.player9!=null){
            player9.pause ();
            Toast.makeText (this,"24kHz Stop",Toast.LENGTH_SHORT).show ();
        }
    }
}