package com.chaturvediji.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToast("Activity Started: STARTED STATE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast("Activity resumed: INTERACTIVE STATE ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("Activity Paused: PAUSED STATE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("Activity Stopped: STOPPED STATE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToast("Activity Restarted: RESTARTED STATE");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("THIS won't be displayed: DESTRPYED STATE");
    }
}
