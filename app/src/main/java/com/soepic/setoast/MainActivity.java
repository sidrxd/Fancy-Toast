package com.soepic.setoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.soepic.sefancytoast.FancyToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buton) {
            showToast();
        }
            
            
    }
    
    private void showToast(){
        new FancyToast()
                .with(this)
                .setGravity(Gravity.BOTTOM,0,100)
                .setIcon(R.drawable.ic_round_group_work_24)
                .setText("Showing Show")
                .cornerRadius(16)
                .hideIcon(false)
                .show();
        
        ;
    }
}