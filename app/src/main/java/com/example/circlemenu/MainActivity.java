package com.example.circlemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenu = findViewById(R.id.circle_menu);
        constraintLayout = findViewById(R.id.constraintLayout);
        circleMenu.setMainMenu(Color.parseColor("#8E7DBE"), R.mipmap.menu, R.mipmap.cancel)
                .addSubMenu(Color.parseColor("#F4E04D"), R.mipmap.home)
                .addSubMenu(Color.parseColor("#F96F5D"), R.mipmap.search)
                .addSubMenu(Color.parseColor("#B0FF92"), R.mipmap.notification)
                .addSubMenu(Color.parseColor("#9D8DF1"), R.mipmap.settings)
                .addSubMenu(Color.parseColor("#9CDE9F"), R.mipmap.gps)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index) {
                            case 0:
                                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#FFDDD2"));
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this, "notification", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#957186"));
                                break;
                            case 2:
                                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#FFE0B5"));
                                break;
                            case 3:
                                Toast.makeText(MainActivity.this, "gps", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#8EF9F3"));
                                break;


                        }
                    }
                });
    }
}