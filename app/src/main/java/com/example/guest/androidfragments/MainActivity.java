package com.example.guest.androidfragments;

import android.app.FragmentManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button moodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moodButton = (Button) findViewById(R.id.moodButton);

        moodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                MoodDialogFragment moodDialogFragment = new MoodDialogFragment ();
                moodDialogFragment.show(fm, "Sample Fragment");
            }
        });
    }


}

