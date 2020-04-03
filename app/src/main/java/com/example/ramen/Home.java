package com.example.ramen;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

/*        LinearLayout gallery = (LinearLayout) getView().findViewById(R.id.gallery);

        //inflater = LayoutInflater.from(this);

        for(int i = 0; i < 6; i++)
        {
            View view = inflater.inflate(R.layout.fragment_home, gallery, false);

            TextView textView = view.findViewById(R.id.text);
            textView.setText("Ramen One");

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.black);

            gallery.addView(view);

        }

*/

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
