package com.soepic.sefancytoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FancyToast {

    ImageView imageView;
    TextView toast;
    
    public FancyToast(){
        
    }
    
    public FancyToast with(Context context) {
        View v = LayoutInflater.from(context).inflate(R.layout.toast, null);
        toast = v.findViewById(R.id.toast_text);
      //  toast.setText(msg);
        imageView = v.findViewById(R.id.toast_img);
        Toast myToast = new Toast(context);
        myToast.setView(v);
        myToast.setDuration(Toast.LENGTH_SHORT);
        myToast.show();
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

}
