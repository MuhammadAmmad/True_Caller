package com.example.nightfury.true_caller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contacts_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_layout);
    }

    public void showDialer(View view){
        Intent i = new Intent(this,Dialer_Activity.class);
        startActivity(i);

    }

    public void showSearch(View view){
        Intent i = new Intent(this, Search_Activity.class);
        startActivity(i);
    }

    public void showBlock(View view){
        Intent i = new Intent(this,Block_Activity.class);
        startActivity(i);
    }

    public void showContacts(View view){
        Intent i = new Intent(this,Contacts_Activity.class);
        startActivity(i);
    }
}
