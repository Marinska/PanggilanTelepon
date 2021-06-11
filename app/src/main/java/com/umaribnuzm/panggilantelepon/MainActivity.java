package com.umaribnuzm.panggilantelepon;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        final EditText number=(EditText)findViewById(R.id.editText);
        Button dial=(Button)findViewById(R.id.button);
        dial.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String toDial="tel: "+number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
            }
        });
    }
}