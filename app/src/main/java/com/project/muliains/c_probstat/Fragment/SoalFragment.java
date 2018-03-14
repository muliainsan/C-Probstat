package com.project.muliains.c_probstat.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.muliains.c_probstat.R;

/**
 * Created by Muliains on 08-Dec-17.
 */

public class SoalFragment extends android.support.v4.app.Fragment{

    public SoalFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_soal, container, false);
    }

}
