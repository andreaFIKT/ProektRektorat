package com.example.andrea.proba;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ANDREA on 10/8/2016.
 */
public class Intro extends Activity {
    ImageView imgIntro;
    Spinner selectLanguage;
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
        selectLanguage = (Spinner) findViewById(R.id.introSelectLanguage);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectLanguage.setAdapter(adapter);


        selectLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:

                    case 1:
                        LocaleHelper.setLocale(getApplicationContext(),"fr");
                        txtSelectLanguage.setText(R.string.izberi_jazik);
                        adapterMk = ArrayAdapter.createFromResource(context,R.array.jazik,R.layout.support_simple_spinner_dropdown_item);
                        selectLanguage.setAdapter(adapterMk);
                        buttonContinue.setText(R.string.kopceProdolzi);
                        break;

                    case 2:
                        LocaleHelper.setLocale(getApplicationContext(),"en");
                        txtSelectLanguage.setText(R.string.txt_selectLanguage);
                        adapterEn = ArrayAdapter.createFromResource(context,R.array.language,R.layout.support_simple_spinner_dropdown_item);
                        selectLanguage.setAdapter(adapterEn);
                        buttonContinue.setText(R.string.continueB);
                        break;

                    default:
                        txtSelectLanguage.setText("");
                        txtSelectLanguage.setText(R.string.txt_selectLanguage);
                        adapterEn = ArrayAdapter.createFromResource(context,R.array.language,R.layout.support_simple_spinner_dropdown_item);
                        selectLanguage.setAdapter(adapterEn);
                        break;


                }
               /* if(i==0)
                {
                    txtSelectLanguage.setText(R.string.izberi_jazik);
                    adapterMk = ArrayAdapter.createFromResource(context,R.array.jazik,R.layout.support_simple_spinner_dropdown_item);
                    selectLanguage.setAdapter(adapterMk);
                }
                else if(i==1)
                {
                    txtSelectLanguage.setText("");
                    txtSelectLanguage.setText(R.string.txt_selectLanguage);
                    adapterEn = ArrayAdapter.createFromResource(context,R.array.language,R.layout.support_simple_spinner_dropdown_item);

                    selectLanguage.setAdapter(adapterEn);
                }*/
                }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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

}
