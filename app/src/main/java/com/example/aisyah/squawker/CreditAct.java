package com.example.aisyah.squawker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CreditAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        //button pengalaman kembali ke menu Main
        Button ton1 = (Button) findViewById(R.id.back);
        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //TODO Auto-generated method stub
                Intent inte = new Intent(CreditAct.this, MainActivity.class);
                startActivity(inte);
            }
        });
    }
}
