package com.easylabs.fragments_example_1;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btShowFirstFragment;
    Button btShowSecondFragment;

    // Класс для прикрепеления Fragment'ов
    FragmentTransaction fTrans;

    // Объявляем объекты типа BlackFragment
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Фрагменты. Их применение и особенности

        btShowFirstFragment = (Button) findViewById(R.id.btShowFirstFragment);
        btShowSecondFragment = (Button) findViewById(R.id.btShowSecondFragment);

        btShowFirstFragment.setOnClickListener(this);
        btShowSecondFragment.setOnClickListener(this);

        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();
    }

    @Override
    public void onClick(View view) {
        // Инциализируем объект для работы с фрагментами
        fTrans = getFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.btShowFirstFragment:
                // Показывать первый фрагмент
                fTrans.add(R.id.llFragments, blankFragment);
                break;
            case R.id.btShowSecondFragment:
                // Показывать второй фрагмент
                fTrans.add(R.id.llFragments, blankFragment2);
                break;
        }
    }
}
