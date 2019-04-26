package com.mohartech.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void getToast(Context context){
        Toast.makeText(context, "This is dependancy Demo", Toast.LENGTH_LONG).show();
    }
}
