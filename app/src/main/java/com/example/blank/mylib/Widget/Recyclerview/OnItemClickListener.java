package com.example.blank.mylib.Widget.Recyclerview;

import android.view.View;

/**
 * Created by blank on 2018/7/31.
 */

public interface OnItemClickListener {
    void onItemClick(View view, int position);

    void OnItemLongClick(View view, int position);//长按事件
}
