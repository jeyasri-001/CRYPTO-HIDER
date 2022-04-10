package com.jeyasri.cryptohider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView ot,ip;
    String data,enc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button);
        ot = findViewById(R.id.output);
        ip = findViewById(R.id.input);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = ip.getText().toString();
                try {
                    enc = cryptohider.encrypt(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ot.setText(enc);
            }
        });

    }
}