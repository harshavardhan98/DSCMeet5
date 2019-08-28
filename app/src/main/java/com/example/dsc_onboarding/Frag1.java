package com.example.dsc_onboarding;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Frag1 extends Fragment {

    public Frag1() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.frag1,container,false);

        ImageView iv_image=view.findViewById(R.id.iv_frag1);
        iv_image.setImageResource(R.drawable.img1);

        TextView tv_text=view.findViewById(R.id.tv_frag1);
        tv_text.setText("Fresh Food");

        YoYo.with(Techniques.Tada)
                .duration(700)
                .repeat(5)
                .playOn(view.findViewById(R.id.iv_frag1));

        return view;
    }
}
// http://tiny.cc/ssndsc