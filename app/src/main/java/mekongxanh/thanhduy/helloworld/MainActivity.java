package mekongxanh.thanhduy.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {
    TextView txtv;    // Khai báo biến txtv để mà lát ánh xạ ở bước 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bước 2: Ánh xạ
        txtv = (TextView) findViewById(R.id.textViewHoTen);//t bằng biến txtv
        // bước 3: viết Code
        txtv.setText("Hello World");
    }
}


