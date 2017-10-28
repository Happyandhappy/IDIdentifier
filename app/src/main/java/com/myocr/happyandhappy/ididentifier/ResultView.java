package com.myocr.happyandhappy.ididentifier;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Happyandhappy on 10/28/2017.
 */

public class ResultView extends LinearLayout {
    private final TextView username;
    private final TextView userregistrogeral;
    private final TextView user_cpf;
    private final TextView match_idrecognition;
    private final TextView zipcode;
    private final TextView match_billrecognition;
    private final TextView match_name;
    private final TextView match_registrogeral;
    private final TextView match_cpf;

    public ResultView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.fragment_result,this);
        username=(TextView)findViewById(R.id.txt_username);
        userregistrogeral=(TextView)findViewById(R.id.txt_user_registrogeral);
        user_cpf=(TextView)findViewById(R.id.txt_user_cpf);
        match_idrecognition=(TextView)findViewById(R.id.txt_match_idrecognition);
        zipcode=(TextView)findViewById(R.id.txt_zipcode);
        match_billrecognition=(TextView)findViewById(R.id.txt_match_billrecognition);
        match_name=(TextView)findViewById(R.id.txt_match_name);
        match_registrogeral=(TextView)findViewById(R.id.txt_match_registrogeral);
        match_cpf=(TextView)findViewById(R.id.txt_match_cpf);
    }


}
