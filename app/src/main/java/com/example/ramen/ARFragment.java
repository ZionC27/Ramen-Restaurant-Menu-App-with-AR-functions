package com.example.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ARFragment extends Fragment  {

    Intent intent ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ar, container, false);
        ImageButton og,miso,spicy,kimchi,sesame,curry,black,house;
        og = (ImageButton) view.findViewById(R.id.Ogramen);
        miso = (ImageButton) view.findViewById(R.id.Misoramen);
        spicy = (ImageButton) view.findViewById(R.id.spicyramen);
        kimchi = (ImageButton) view.findViewById(R.id.Kimchiramen);
        sesame = (ImageButton) view.findViewById(R.id.Sesameramen);
        curry =  (ImageButton) view.findViewById(R.id.Curryramen);
        black = (ImageButton) view.findViewById(R.id.blackramen);
        house = (ImageButton) view.findViewById(R.id.Houseramen);

        og.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getActivity(),"og",Toast.LENGTH_LONG).show();
               intent = new Intent(getActivity(),Arfunction.class);
               startActivity(intent);
            }
        });
        miso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Miso",Toast.LENGTH_LONG).show();
            }
        });
        spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"spicy",Toast.LENGTH_LONG).show();
            }
        });
        kimchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"kimchi",Toast.LENGTH_LONG).show();
            }
        });
        sesame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"sesame",Toast.LENGTH_LONG).show();
            }
        });
        curry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"curry",Toast.LENGTH_LONG).show();
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"black",Toast.LENGTH_LONG).show();
            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"house",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }



}
