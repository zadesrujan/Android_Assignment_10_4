package com.example.user.android_assignment_10_4_1;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTab_1 extends Fragment {

    public FragmentTab_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Called to have the fragment instantiate its user interface view. This is optional, and non-graphical fragments can return null (which is the default implementation)
        // Inflate the layout for this fragment
        //inflater	LayoutInflater: The LayoutInflater object that can be used to inflate any views in the fragment,
        //container	ViewGroup: If non-null, this is the parent view that the fragment's UI should be attached to. The fragment should not add the view itself, but this can be used to generate the LayoutParams of the view.
        //savedInstanceState	Bundle: If non-null, this fragment is being re-constructed from a previous saved state as given here.
//Returns
        //View	Return the View for the fragment's UI, or null.
        View rootView=inflater.inflate(R.layout.fragment_tab_1, container, false);
        return rootView;
    }

}