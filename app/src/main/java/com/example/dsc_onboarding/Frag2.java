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

public class Frag2 extends Fragment {

    public Frag2() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.frag1,container,false);

        ImageView iv_image=view.findViewById(R.id.iv_frag1);
        iv_image.setImageResource(R.drawable.img2);

        TextView tv_text=view.findViewById(R.id.tv_frag1);
        tv_text.setText("Fast Delivery");

        return view;
    }
}
// http://tiny.cc/ssndsc