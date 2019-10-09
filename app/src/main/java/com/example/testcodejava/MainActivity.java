package com.example.testcodejava;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutRoot;
    private RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        InitLayoutByLinear();
        InitLayoutByRelative();

        setContentView(relativeLayoutRoot);
    }

    public void InitLayoutByRelative()
    {
        relativeLayoutRoot = new RelativeLayout(this);
//        LayoutParams relativeParamsRoot = new LayoutParams
//                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        //Relative Layout Second
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativeParamsSecond = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeParamsSecond.addRule(RelativeLayout.CENTER_HORIZONTAL);
        relativeLayoutSecond.setId(R.id.rlsecond);
        relativeLayoutSecond.setLayoutParams(relativeParamsSecond);

        //ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setId(R.id.imgView);
        imageView.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams relativeParamsTextView = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeParamsTextView.addRule(RelativeLayout.CENTER_VERTICAL);
        relativeParamsTextView.setMargins(20,0,0,0);
        relativeParamsTextView.addRule(RelativeLayout.RIGHT_OF, imageView.getId());
        textView.setLayoutParams(relativeParamsTextView);
        textView.setText(R.string.hello);
        textView.setId(R.id.textView);

        relativeLayoutSecond.addView(imageView);
        relativeLayoutSecond.addView(textView);

        //Button
        Button btnClick = new Button(this);
        RelativeLayout.LayoutParams relativeParamsBtnClick = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeParamsBtnClick.addRule(RelativeLayout.BELOW, relativeLayoutSecond.getId());
        relativeParamsBtnClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick.setPadding(10,10,10,10);
        btnClick.setLayoutParams(relativeParamsBtnClick);
        btnClick.setText(R.string.btntext);
        btnClick.setId(R.id.btnClick);

        //Button2
        Button btnClick2 = new Button(this);
        RelativeLayout.LayoutParams relativeParamsBtnClick2 = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeParamsBtnClick2.addRule(RelativeLayout.BELOW, btnClick.getId());
        relativeParamsBtnClick2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick2.setLayoutParams(relativeParamsBtnClick2);
        btnClick2.setText(R.string.btntext2);

        relativeLayoutRoot.addView(relativeLayoutSecond);
        relativeLayoutRoot.addView(btnClick);
        relativeLayoutRoot.addView(btnClick2);
    }

    public void InitLayoutByLinear()
    {
        //LinearLayout Root
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams linearParamsRoot = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(linearParamsRoot);

        //LinearLayout Second
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams linearParamsSecond = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearParamsRoot.gravity = Gravity.CENTER;
        linearLayoutSecond.setLayoutParams(linearParamsSecond);

        //ImageView
        ImageView imgView = new ImageView(this);
        LinearLayout.LayoutParams layoutParamsImgView = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        imgView.setLayoutParams(layoutParamsImgView);
        imgView.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView txtView = new TextView(this);
        LinearLayout.LayoutParams layoutParamsTxtView = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsTxtView.gravity = Gravity.CENTER;
        layoutParamsTxtView.setMargins(20, 0, 0, 0);
        txtView.setLayoutParams(layoutParamsTxtView);
        txtView.setText(R.string.hello);

        linearLayoutSecond.addView(imgView);
        linearLayoutSecond.addView(txtView);

        //Button
        Button btnClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsBtnClick = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsBtnClick.gravity = Gravity.CENTER;
        btnClick.setLayoutParams(layoutParamsBtnClick);
        btnClick.setPadding(20, 0, 0, 0);
        btnClick.setText(R.string.btntext);

        //Button2
        Button btnClick2 = new Button(this);
        LinearLayout.LayoutParams layoutParamsBtnClick2 = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsBtnClick2.gravity = Gravity.CENTER;
        btnClick2.setLayoutParams(layoutParamsBtnClick2);
        btnClick2.setPadding(20, 0, 0, 0);
        btnClick2.setText(R.string.btntext);

        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(btnClick);
        linearLayoutRoot.addView(btnClick2);
    }
}
