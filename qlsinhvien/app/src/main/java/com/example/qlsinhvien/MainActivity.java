package com.example.qlsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsinhvien , btnthoat , btndiem ,btngiangvien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        sinhvien();
        thoat();
        diem();
        giangvien();

    }

    private void giangvien() {
        btngiangvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GiangvienMain.class);
                startActivity(intent);
            }
        });
    }


    private void thoat(){
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void sinhvien(){
        btnsinhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,sinhVienMain.class); // lệnh chuyển form từ chính sang form 2
                startActivity(intent); // lệnh chuyển màn hình
            }
        });
    }

    private void diem (){
        btndiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,diemMain.class); // lệnh chuyển form từ chính sang form 2
                startActivity(intent); // lệnh chuyển màn hình
            }
        });
    }




    private void anhxa(){

        btnsinhvien=findViewById(R.id.btnsinhvien);
        btndiem=findViewById(R.id.btndiem);
        btnthoat=findViewById(R.id.btnthoat);
        btngiangvien=findViewById(R.id.btngiangvien);

    }
}