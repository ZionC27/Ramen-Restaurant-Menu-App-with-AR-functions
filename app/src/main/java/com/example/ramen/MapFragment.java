package com.example.ramen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MapFragment extends Fragment
{

    public TextView text ;
    public static String SAVED_STR = "some";
    public static String MAIN_STR = "main string ";

    String savedThing ;

    SharedPreferences saved;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        /*Intent intent = getIntent();

        String message = intent.getStringExtra(AboutFragment.TAG_STR);

        saved = getApplicationContext().getSharedPreferences
*/

        View view = inflater.inflate(R.layout.fragment_map, container, false);
        WebView webView = (WebView)view.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); //enables javascript
        webView.setWebViewClient(new WebViewClient());//allows us to open URL in app
        webView.loadUrl("https://www.facebook.com/wakayamaramenbar/");
        return view;
        //return inflater.inflate(R.layout.fragment_map, container, false);
    }

}
