package io.github.hexiangyuan.contacts_mvvm.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */

public class BindConfig {
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }
}
