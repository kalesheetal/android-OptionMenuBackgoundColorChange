package com.sk.optionmenubackgrouncolorchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.rellayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.yellow:
                view.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.blue:
                view.setBackgroundColor(Color.BLUE);
                break;

            case R.id.white:
                view.setBackgroundColor(Color.WHITE);
                break;


            case R.id.green:
                view.setBackgroundColor(Color.GREEN);
                break;

            case R.id.black:
                view.setBackgroundColor(Color.BLACK);
                break;

            case R.id.red:
                view.setBackgroundColor(Color.RED);
                break;

            case R.id.gray:
                view.setBackgroundColor(Color.LTGRAY);
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}