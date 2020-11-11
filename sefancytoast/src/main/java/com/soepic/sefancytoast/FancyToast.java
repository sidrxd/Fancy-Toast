package com.soepic.sefancytoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class FancyToast {

    ImageView imageView;
    TextView toast;
    Toast myToast;
    CardView cardView;
    boolean isHidden= false;
    
    
    public FancyToast(){
        
    }
    
    public FancyToast with(Context context) {
        View v = LayoutInflater.from(context).inflate(R.layout.toast, null);
        toast = v.findViewById(R.id.toast_text);
      //  toast.setText(msg);
        imageView = v.findViewById(R.id.toast_img);
        cardView = v.findViewById(R.id.cardView);
        
        myToast = new Toast(context);
        myToast.setView(v);
        myToast.setDuration(Toast.LENGTH_SHORT);
        return this;
    }
    public FancyToast setText(String message){
        toast.setText(message);
        return this;
    }
    public FancyToast setIcon(int icon){
        imageView.setImageResource(icon);
        return this;
    }
    public FancyToast setGravity(int gravity,int xOffset,int yOffset){
        myToast.setGravity(gravity,xOffset,yOffset);
        
        return this;
    }
    public void show(){
        myToast.show();
    }
    public FancyToast cornerRadius(float radius){
        cardView.setRadius(radius);
        return this;
    }
    
    public FancyToast hideIcon(boolean isHidden){
        this.isHidden = isHidden;
        
        if (isHidden){
            imageView.setVisibility(View.GONE);
        }else {
            imageView.setVisibility(View.VISIBLE);
        }
        return this;
    }
    
    

}
