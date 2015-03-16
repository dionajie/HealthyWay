package com.example.ivan.healthyway;

import android.app.Activity;
import android.content.Intent;

import com.example.ivan.healthyway.View.CariActivity_;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @Click(R.id.btn_darurat)
    void ClickDarurat(){}

    @Click(R.id.btn_cari)
    void ClickCari(){
        Intent CariAct = new Intent(this,CariActivity_.class);
        startActivity(CariAct);
    }


}
