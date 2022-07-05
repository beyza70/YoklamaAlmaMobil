package com.example.javalogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class YoklamaAlmaActivity extends AppCompatActivity {
    private Button yoklama_al;
    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoklama_alma);

        yoklama_al=(Button)findViewById(R.id.yoklama_al);
        textView = (TextView) findViewById(R.id.textView);


        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        Python py = Python.getInstance();
        PyObject pyob = py.getModule("pyfile");

        //PyObject obj = pyob.callAttr("main");

        yoklama_al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pyob.callAttr("main");
            }
        });




    }
}