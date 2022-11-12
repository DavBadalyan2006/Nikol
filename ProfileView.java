package com.samsung.imagedemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ProfileView extends LinearLayout {

    private final ImageView profileImage;
    private final TextView profileText;
    public ProfileView(Context context) {
        this(context, null);
    }

    public ProfileView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProfileView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.view_profile, this);
        profileImage = v.findViewById(R.id.profile_image);
        profileText = v.findViewById(R.id.profile_text);

        Resources resources = getResources();
        String nikol = resources.getString(R.string.davachan);
        setup(R.drawable.nikolpashinyan, nikol);
    }

    public void setup(int resForImage, String txt){
        profileImage.setImageResource(resForImage);
        profileText.setText(txt);
    }

//    public ProfileView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
}