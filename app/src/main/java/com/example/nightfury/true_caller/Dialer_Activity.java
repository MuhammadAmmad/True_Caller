package com.example.nightfury.true_caller;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Dialer_Activity extends AppCompatActivity implements View.OnClickListener {

            private EditText screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialer_layout);
        initializeView();
    }

    private void initializeView() {

        screen = (EditText) findViewById(R.id.edittext);
        int idList[] = {R.id.b1, R.id.b2, R.id.b3,
                R.id.b4, R.id.b5, R.id.b6,
                R.id.b7, R.id.b8, R.id.b9,
                R.id.bstar, R.id.b0, R.id.bhash,
                R.id.dial1, R.id.dial2, R.id.del};

        for (int i : idList) {
            View v = (View) findViewById(i);
            v.setOnClickListener(this);
        }
    }

    public void display(String val){
        screen.append(val);
    }

    private boolean checkCallPermission(){
        String permission =  "android.permission.CALL_PHONE";
        int res = getApplicationContext().checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                display("1");
                break;
            case R.id.b2:
                display("2");
                break;
            case R.id.b3:
                display("3");
                break;
            case R.id.b4:
                display("4");
                break;
            case R.id.b5:
                display("5");
                break;
            case R.id.b6:
                display("6");
                break;
            case R.id.b7:
                display("7");
                break;
            case R.id.b8:
                display("8");
                break;
            case R.id.b9:
                display("9");
                break;
            case R.id.b0:
                display("0");
                break;
            case R.id.bstar:
                display("*");
                break;
            case R.id.bhash:
                display("#");
                break;
            case R.id.dial1:
                if(screen.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(),"First Enter Digits Then Click",Toast.LENGTH_SHORT).show();
                else if(checkCallPermission())
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+screen.getText())));
                break;

            case R.id.del:
                if(screen.getText().toString().length()>=1) {
                    String newScreen = screen.getText().toString().substring(0,screen.getText().toString().length()-1);
                    screen.setText(newScreen);
                }
                break;
        }
    }
}
