package com.example.librarykatlog;

import android.app.Activity;
import android.app.FragmentManager;
;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        DetailFragment fragment = new DetailFragment();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.commit();
    }
}