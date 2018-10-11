package com.example.malkoti.testactivityintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String passedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("DEBUG_SECOND_ACTIVITY", "Hashcode of activity object =" + this.hashCode());
        Intent launchIntent = getIntent();
        passedMessage = launchIntent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = findViewById(R.id.second_text);
        textView.setText(passedMessage);

        final Button secondBtn = findViewById(R.id.second_btn);

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent originalIntent = getIntent();
        String text = originalIntent.getStringExtra(Intent.EXTRA_TEXT);
        Log.d("DEBUG_SECOND_ACTIVITY", "onResume: text in intent" + text);
    }
}
