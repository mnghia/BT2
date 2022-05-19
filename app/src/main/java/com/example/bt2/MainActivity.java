package com.example.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText lich;
    Button nutnhan3;
    TextView amlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nutnhan3=findViewById(R.id.chuyenlich);
        lich=findViewById(R.id.lich);
        amlich=findViewById(R.id.amlich);
        nutnhan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]={"Canh","Tân","Nhâm","Qúy","Giáp","Ất","Bình","Đinh","Mậu","Kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String duong =lich.getText().toString();
                int n=Integer.parseInt(duong);
              String am=can[n%10]+" "+chi[n%12];
              amlich.setText(am);
                }
        });
    }
}