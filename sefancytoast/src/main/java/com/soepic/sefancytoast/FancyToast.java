package com.soepic.sefancytoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FancyToast {


    public static void makeToast(Context context, String msg, int toastImg) {
        View v = LayoutInflater.from(context).inflate(R.layout.toast, null);
        TextView toast = v.findViewById(R.id.toast_text);
        toast.setText(msg);

        ImageView imageView = v.findViewById(R.id.toast_img);
        imageView.setImageResource(toastImg);

        Toast myToast = new Toast(context);

        myToast.setView(v);
        myToast.setDuration(Toast.LENGTH_SHORT);
        myToast.show();

    }
    public static void setText (){
        
    }

}
