package com.example.ramen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

    private Button button;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        //link to website that build all of the button code:
        //https://www.c-sharpcorner.com/article/sociamedia-link-share-in-android-using-androi/

       /* button=(Button) getView().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = "Your body is here";
                String shareSub = "Your subject";
                intent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "share using"));

            }
        });

*/
        //orginal code
        return inflater.inflate(R.layout.fragment_about, container, false);


    }//end onCreateView

}//end class
