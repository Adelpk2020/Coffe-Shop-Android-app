package com.adel2020.coffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int quantity,price ;
 CheckBox c1 , c2 ;
 EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkbox1);
        c2 = findViewById(R.id.checkbox2);
        calculate(c1.isChecked(),c2.isChecked());
    }
    public void increase(View view){
        if (quantity==100)
        return;
        quantity=quantity+1;
        display(quantity);
        calculate(c1.isChecked(),c2.isChecked());
    }
    public void decrease (View view){
        if (quantity==1)
            return;
        quantity=quantity-1;
        display(quantity);
        calculate(c1.isChecked(),c2.isChecked());
    }
public  void  display(int quantity){
    TextView textView = findViewById(R.id.quantxt);
    textView.setText(String.valueOf(quantity));
}
public void calculate (boolean c1 , boolean c2){
    price=5;
    TextView textView = findViewById(R.id.price);
    if (c1)
        price=price+1;
    if (c2)
        price=price+2;
    price = price * quantity;
    textView.setText(String.valueOf(price));
}
public void summary(View view){
 name=findViewById(R.id.name);
    Intent intent = new Intent(MainActivity.this,show.class);
    intent.putExtra("NAME",name.getText().toString());
    intent.putExtra("PRICE",price);
    startActivity(intent);
}
}
