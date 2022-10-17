package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText etnum1;
    private EditText etresult;
    private TextView tvcon;
    private Button buttonSub;
    private Button buttonClear;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvcon = (TextView) findViewById(R.id.tvcon);
        etnum1 = (EditText) findViewById(R.id.etnum1);
        etresult = (EditText) findViewById(R.id.etresult);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        spinner = (Spinner) findViewById(R.id.spinner);

        String [] convert = {
                "Meters per second To Feet per second",
                "Meters per second To kilometer per hour",
                "Meters per second To Miles per hour",
                "Meter To centimeter",
                "Meter To Foot",
                "Meter To Inch",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.selected_item, convert);
        adapter.setDropDownViewResource(R.layout.dropdown_item);

        spinner.setAdapter(adapter);

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = spinner.getSelectedItemPosition();
                tvcon.setText("You choose " + String.valueOf(convert[index]));
                switch (index){
                    case 0:
                        //Meters per second To Feet per second
                        double number1 = Double.parseDouble(etnum1.getText().toString());
                        double sum = number1 * 3.28084;
                        etresult.setText( String.valueOf(sum));
                        break;

                    case 1:
                        //Meters per second To kilometer per hour
                        number1 = Double.parseDouble(etnum1.getText().toString());
                        sum = number1 * 3.6;
                        etresult.setText( String.valueOf(sum));
                        break;

                    case 2:
                        //Meters per second To Miles per hour
                        number1 = Double.parseDouble(etnum1.getText().toString());
                        sum = number1 * 2.23694;
                        etresult.setText( String.valueOf(sum));
                        break;

                    case 3:
                        //Meter To centimeter
                        number1 = Double.parseDouble(etnum1.getText().toString());
                        sum = number1 * 100;
                        etresult.setText( String.valueOf(sum));
                        break;

                    case 4:
                        //Meter To Foot
                        number1 = Double.parseDouble(etnum1.getText().toString());
                        sum = number1 * 3.28084;
                        etresult.setText( String.valueOf(sum));
                        break;

                    case 5:
                        //Meter To Inch
                        number1 = Double.parseDouble(etnum1.getText().toString());
                        sum = number1 * 39.3701;
                        etresult.setText( String.valueOf(sum));
                        break;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etresult.setText("");
                etnum1.setText("");
            }
        });
    }
}