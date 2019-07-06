package com.adel2020.coffe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class show extends AppCompatActivity {
TextView viewname , viewprice ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        String name =getIntent().getStringExtra("NAME");
        int price = getIntent().getIntExtra("Price",0);
        viewname=findViewById(R.id.name);
        viewprice=findViewById(R.id.price);
        viewname.setText(name.toString());
        viewprice.setText(String.valueOf(price));

    }
}
