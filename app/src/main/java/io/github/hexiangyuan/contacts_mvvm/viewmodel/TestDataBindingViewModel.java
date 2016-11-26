package io.github.hexiangyuan.contacts_mvvm.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-26
 */

public class TestDataBindingViewModel {

    Context mContext;

    public TestDataBindingViewModel(Context context) {
        mContext = context;
    }

    public void onClick1(View view) {
        Toast.makeText(mContext, "click1", Toast.LENGTH_SHORT).show();
    }

    public void onClick1(String str) {
        Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();
    }
}
