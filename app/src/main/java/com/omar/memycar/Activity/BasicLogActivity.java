package com.omar.memycar.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.omar.memycar.R;

/**
 * Created by Omar on 1/25/2018.
 */

public class BasicLogActivity extends AppCompatActivity {

    Button Login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_login);
        Login = (Button)findViewById(R.id.bu_baselog);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.main_menu , menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_ar:
                Intent menuIntent = new Intent(getApplicationContext() ,LoginAr_Activity.class );
                startActivity(menuIntent);
                break;
            case R.id.menu_en:
                Intent menIntent = new Intent(getApplicationContext(),LoginEn_Activity.class );
                startActivity(menIntent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showPopUpMenue(View view) {
        PopupMenu popupMenu = new PopupMenu(this , view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        popupMenu.setOnMenuItemClickListener(( PopupMenu.OnMenuItemClickListener)popupMenu);
        popupMenu.show();
    }
}
