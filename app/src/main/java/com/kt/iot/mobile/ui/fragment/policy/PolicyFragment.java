package com.kt.iot.mobile.ui.fragment.policy;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.*;

import com.kt.iot.mobile.android.R;
import com.kt.iot.mobile.utils.Util;

/**
 * Created by ceoko on 15. 6. 16..
 */
public class PolicyFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_policy, container, false);

        TextView tvTerm = (TextView) v.findViewById(R.id.tv_term_body);
        TextView tvPolicy = (TextView) v.findViewById(R.id.tv_policy_body);

        tvTerm.setMovementMethod(new ScrollingMovementMethod());
        tvPolicy.setMovementMethod(new ScrollingMovementMethod());


        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

        ((AppCompatActivity)getActivity()).getSupportActionBar()
                .setCustomView(Util.getCustomTitleView(getActivity(), "약관과 정책"));
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowCustomEnabled(true);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.pre);
    }


}
