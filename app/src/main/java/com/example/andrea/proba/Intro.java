package com.example.andrea.proba;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.andrea.proba.Utils.LocaleUtils;

/**
 * Created by ANDREA on 10/8/2016.
 */
public class Intro extends Activity {
    ImageView imgIntro;
    ListView selectLanguage;
    TextView txtSelectLanguage;
    Button buttonContinue;
    Context context;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapterMk;
    ArrayAdapter<CharSequence> adapterEn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_layout);
        context = this;
        imgIntro = (ImageView) findViewById(R.id.introImage);
        txtSelectLanguage = (TextView) findViewById(R.id.selectLanguageLabel);
//        txtSelectLanguage.setText(R.string.txt_selectLanguage);
        selectLanguage = (ListView) findViewById(R.id.introSelectLanguage);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectLanguage.setAdapter(adapter);

       /* selectLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int selection = selectLanguage.getSelectedItemPosition();

                 if(selection==0) {
                     LocaleUtils.setLocale(LocaleUtils.SPANISH);
                     txtSelectLanguage.setText(R.string.txt_selectLanguage);
                     adapterMk = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                     selectLanguage.setAdapter(adapterMk);
                     buttonContinue.setText(R.string.kopceProdolzi);
                     Log.d("Spanski jazik","Izberen e spanski jazik");
                 }
                else if(selection==1) {
                     LocaleUtils.setLocale(LocaleUtils.FRENCH);
                     txtSelectLanguage.setText(R.string.txt_selectLanguage);
                     adapterEn = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                     selectLanguage.setAdapter(adapterEn);
                     buttonContinue.setText(R.string.continueB);
                 }
                else if(selection==2)
                 {
                     LocaleUtils.setLocale(LocaleUtils.ENGLISH);
                     txtSelectLanguage.setText(R.string.txt_selectLanguage);
                     adapterEn = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                     selectLanguage.setAdapter(adapterEn);
                     buttonContinue.setText(R.string.continueB);
                 }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                LocaleHelper.setLocale(getApplicationContext(), "fr");
                txtSelectLanguage.setText(R.string.izberi_jazik);
                adapterMk = ArrayAdapter.createFromResource(context, R.array.jazik, R.layout.support_simple_spinner_dropdown_item);
                selectLanguage.setAdapter(adapterMk);
                buttonContinue.setText(R.string.kopceProdolzi);
            }
        });*/
        selectLanguage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    LocaleUtils.setLocale(LocaleUtils.SPANISH);
                    txtSelectLanguage.setText(R.string.txt_selectLanguage);
                    adapterMk = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                    selectLanguage.setAdapter(adapterMk);
                    buttonContinue.setText(R.string.continueB);
                    Log.d("Spanski jazik","Izberen e spanski jazik");
                }
                else if(i==1) {
                    LocaleUtils.setLocale(LocaleUtils.FRENCH);
                    txtSelectLanguage.setText(R.string.txt_selectLanguage);
                    adapterEn = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                    selectLanguage.setAdapter(adapterEn);
                    buttonContinue.setText(R.string.continueB);
                }
                else if(i==2)
                {
                    LocaleUtils.setLocale(LocaleUtils.ENGLISH);
                    txtSelectLanguage.setText(R.string.txt_selectLanguage);
                    adapterEn = ArrayAdapter.createFromResource(context, R.array.language, R.layout.support_simple_spinner_dropdown_item);
                    selectLanguage.setAdapter(adapterEn);
                    buttonContinue.setText(R.string.continueB);
                }

            }
        });

        buttonContinue = (Button) findViewById(R.id.btnContinue);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intro.this,Menu.class);
                startActivity(intent);
            }
        });
    }
    /*LocaleHelper.setLocale(getApplicationContext(),"en");
    txtSelectLanguage.setText(R.string.txt_selectLanguage);
    adapterEn = ArrayAdapter.createFromResource(context,R.array.language,R.layout.support_simple_spinner_dropdown_item);
    selectLanguage.setAdapter(adapterEn);
    buttonContinue.setText(R.string.continueB);
    break;*/

}
