package com.example.nightfury.true_caller;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Dialer_Activity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST =1;

    TextView tv_number;
    Button b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_0,b_star,b_hash,b_call,b_clear,b_bclear;
    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialer_layout);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.CALL_PHONE)){
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST);
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST);
            }
        }

        tv_number = (TextView) findViewById(R.id.tv_number);
        b_1 = (Button) findViewById(R.id.b_1);
        b_2 = (Button) findViewById(R.id.b_2);
        b_3 = (Button) findViewById(R.id.b_3);
        b_4 = (Button) findViewById(R.id.b_4);
        b_5 = (Button) findViewById(R.id.b_5);
        b_6 = (Button) findViewById(R.id.b_6);
        b_7 = (Button) findViewById(R.id.b_7);
        b_8 = (Button) findViewById(R.id.b_8);
        b_9 = (Button) findViewById(R.id.b_9);
        b_0 = (Button) findViewById(R.id.b_0);
        b_star = (Button) findViewById(R.id.b_star);
        b_hash = (Button) findViewById(R.id.b_hash);
        b_call = (Button) findViewById(R.id.b_call);
        b_clear = (Button) findViewById(R.id.b_clear);
        b_bclear = (Button) findViewById(R.id.bclear);


        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "1";
                tv_number.setText(number);
            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "2";
                tv_number.setText(number);
            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "3";
                tv_number.setText(number);
            }
        });

        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "4";
                tv_number.setText(number);
            }
        });

        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "5";
                tv_number.setText(number);
            }
        });

        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "6";
                tv_number.setText(number);
            }
        });

        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "7";
                tv_number.setText(number);
            }
        });

        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "8";
                tv_number.setText(number);
            }
        });

        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "9";
                tv_number.setText(number);
            }
        });

        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "0";
                tv_number.setText(number);
            }
        });

        b_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "*";
                tv_number.setText(number);
            }
        });

        b_hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + "#";
                tv_number.setText(number);
            }
        });

        b_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+number));
                startActivity(i);
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = "";
                tv_number.setText(number);
            }
        });
        b_bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv_number.getText().toString().length() >= 1) {
                    number = tv_number.getText().toString().substring(0,tv_number.getText().toString().length()-1);
                    tv_number.setText(number);
                }

            }
        });


    }


    public void showDialar(View view) {
        Intent i = new Intent(this, Dialer_Activity.class);
        startActivity(i);
    }

    public void showContacts(View v) {
        Intent i = new Intent(this, Contacts_Activity.class);
        startActivity(i);
    }

    public void showBlocks(View v) {
        Intent i = new Intent(this, Block_Activity.class);
        startActivity(i);
    }

    public void showSearch(View v) {
        Intent i = new Intent(this, Search_Activity.class);
        startActivity(i);
    }
}

    


