package com.example.ramen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutFragment extends Fragment
{

    public static String  TAG_STR = "income";
    public static final String A_STR = "unique name";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_map, container, false);

        Button button;

        button = (Button)view.findViewById(R.id.menuButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //mapActivity();
            }
        });

        return view;
        //orginal code
        //return inflater.inflate(R.layout.fragment_about, container, false);


    }//end onCreateView

    /*public void mapActivity()
    {
        Intent intent = new Intent(AboutFragment.this, MenuFragment.class);
        startActivity(intent);
    }
*/



}//end class
