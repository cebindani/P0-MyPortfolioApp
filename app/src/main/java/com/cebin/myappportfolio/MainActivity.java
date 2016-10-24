package com.cebin.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {

        String message = null;

        int buttonId = view.getId();
        switch (buttonId) {
            case R.id.button_popular_movies:
                message = "This button will launch my Popular Movies app!";
                break;
            case R.id.button_stock_hawk:
                message = "This button will launch my Stock Hawk app!";
                break;
            case R.id.button_build_it_bigger:
                message = "This button will launch my Build It Bigger app!";
                break;
            case R.id.button_make_material:
                message = "This button will launch my Material app!";
                break;
            case R.id.button_go_ubiquitous:
                message = "This button will launch my Go Ubiquitous app!";
                break;
            case R.id.button_capstone:
                message = "This button will launch my Capstone app!";
                break;
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

}
