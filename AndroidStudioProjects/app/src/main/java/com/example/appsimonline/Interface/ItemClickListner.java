package com.example.appsimonline.Interface;

import android.view.View;

public interface ItemClickListner {

    void onClick(View view, int position, boolean isLongClick);

    void onClick(View view);

    void setItemClickListner(ItemClickListner listner);
}
