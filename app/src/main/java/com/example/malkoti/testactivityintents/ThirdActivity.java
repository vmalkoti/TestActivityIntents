package com.example.malkoti.testactivityintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d("DEBUG_THIRD_ACTIVITY", "Hashcode of activity object =" + this.hashCode());
    }
}
