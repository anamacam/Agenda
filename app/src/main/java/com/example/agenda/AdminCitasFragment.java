package com.example.agenda;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdminCitasFragment extends Fragment {


    public AdminCitasFragment() {
        // Required empty public constructor
    }

    public static AdminCitasFragment newInstance(String param1, String param2) {
        AdminCitasFragment fragment = new AdminCitasFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_citas, container, false);
    }
}