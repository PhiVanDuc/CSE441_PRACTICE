package com.example.ex03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2, edt3;
    private Button btnTong, btnHieu, btnTich, btnThuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);

        btnTong = findViewById(R.id.btn1);
        btnHieu = findViewById(R.id.btn2);
        btnTich = findViewById(R.id.btn3);
        btnThuong = findViewById(R.id.btn4);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());

                edt3.setText("a + b = " + (a + b));
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());

                edt3.setText("a - b = " + (a - b));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());

                edt3.setText("a * b = " + (a * b));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());

                edt3.setText("a / b = " + (a / b));
            }
        });
    }
}