package com.example.lab6menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnChonMau;
    ConstraintLayout manHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnChonMau = findViewById(R.id.btnChon_mau);
        manHinh = findViewById(R.id.manhinh);

        //Đăng kí view cho context_menu
        registerForContextMenu(btnChonMau);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuDo) {
            manHinh.setBackgroundColor(Color.RED);
        }
        if (item.getItemId() == R.id.menuVang) {
            manHinh.setBackgroundColor(Color.YELLOW);
        }
        if (item.getItemId() == R.id.menuXanh) {
            manHinh.setBackgroundColor(Color.BLUE);
        }

        return super.onContextItemSelected(item);
    }
}