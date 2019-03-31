package com.example.labo4;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.labo4.AppConstants;
import com.example.labo4.usuario;

public class ShareActivity extends AppCompatActivity {
    private usuario mUSer;
    private TextView muser,email,count;
    private Button btn;
    private TextView l1,l2,l3,l4,l5,l6,l7,l8,l9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        setCon();
        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();
        usuario user = (usuario) bundle.getSerializable(AppConstants.KEY);
        Toast.makeText(this,user.getmName(),Toast.LENGTH_LONG).show();
        muser.setText(user.getmName());
    }

    public void setCon(){
        muser = findViewById(R.id.user_name1);
        email = findViewById(R.id.user_email1);
        count = findViewById(R.id.cuenta);
        btn = findViewById(R.id.send);
        l1 = findViewById(R.id.t1);
        l2 = findViewById(R.id.t2);
        l3 = findViewById(R.id.t3);
        l4 = findViewById(R.id.t4);
        l5 = findViewById(R.id.t5);
        l6 = findViewById(R.id.t6);
        l7 = findViewById(R.id.t7);
        l8 = findViewById(R.id.t8);
        l9 = findViewById(R.id.t9);
    }

}