package com.myocr.happyandhappy.ididentifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ResultView resultView;
    OCRData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=new OCRData();
        resultView=(ResultView)findViewById(R.id.resultView);
        resultView.setData(data);
    }
}
