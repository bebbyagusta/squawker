package com.example.aisyah.squawker;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fungsi untuk mengalamatkan button dengan halamn yang dituju
        Button ton1 = (Button) findViewById(R.id.buttonFragment);
        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
            //TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, FragmentAct.class);
                startActivity(inte);
            }
        });

        Button ton2 = (Button) findViewById(R.id.buttonCredit);
        ton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, CreditAct.class);
                startActivity(inte);
            }
        });

        //memberikan style pada font
        text1=(TextView)findViewById(R.id.textJudul);
        Typeface customfont= Typeface.createFromAsset(getAssets(),"font/Romantic Beach.ttf");
        text1.setTypeface(customfont);
}
}
