package com.fib.drawabletablayoutapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by klogi on 21/12/15.
 */
    public class FragmentNoMenu extends android.support.v4.app.Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_no_menu, container, false);
            setHasOptionsMenu(false);
            return rootView;
        }
    }
