package com.example.lab6menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity2 extends AppCompatActivity {
    private Button btnPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnPopupMenu = findViewById(R.id.btnPopupMenu);

        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }

    private void ShowMenu() {
        PopupMenu popupMenu = new PopupMenu(this, btnPopupMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.menuThem) {
                    btnPopupMenu.setText("Menu Them");
                }
                if (itemId == R.id.menuSua) {
                    btnPopupMenu.setText("Menu Sua");
                }
                if (itemId == R.id.menuXoa) {
                    btnPopupMenu.setText("Menu Xoa");
                }
                return false;
            }
        });
        popupMenu.show();
    }
}