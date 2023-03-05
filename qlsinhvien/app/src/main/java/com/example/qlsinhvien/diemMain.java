package com.example.qlsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.qlsinhvien.adapter.DiemAdapter;
import com.example.qlsinhvien.model.Diem;

import java.util.ArrayList;

public class diemMain extends AppCompatActivity {

    ListView lvdiem ;
    ArrayList<Diem> diemArrayList ;

    DiemAdapter adapter ;

    Button btnthemdiem , btnsuadiem,btnbackd ,btntaomoidiem;
    EditText editdiemmasv , editdiemtoan , editdiemhoa , editdiemly  ;

    int vitri=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diem_main);
        anhxa();
        them();
        sua();
        xoa();
        back();
        taomoi();
        adapter=new DiemAdapter(this,R.layout.dong_diem,diemArrayList);
        lvdiem.setAdapter(adapter);

    }

    private void them (){
        btnthemdiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String a=editdiemmasv.getText().toString();
                Float b=Float.parseFloat(editdiemtoan.getText().toString());
                Float c=Float.parseFloat(editdiemhoa.getText().toString());
                Float d=Float.parseFloat(editdiemly.getText().toString());
                Float tbc =(b+c+d)/3;

                if (a.toString().equals("")){
                    Toast.makeText(diemMain.this, "yêu cầu nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }else {
                    diemArrayList.add(new Diem(a,b,c,d,tbc));
                    adapter.notifyDataSetChanged();
                    Toast.makeText(diemMain.this, "thêm điểm thành công", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private void sua(){
        lvdiem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                vitri=i ;
                editdiemmasv.setText(diemArrayList.get(i).getMasv());
                editdiemtoan.setText(diemArrayList.get(i).getDiemtoan()+"");
                editdiemhoa.setText(diemArrayList.get(i).getDiemhoa()+"");
                editdiemly.setText(diemArrayList.get(i).getDiemly()+"");
                Toast.makeText(diemMain.this, "đã chọn sửa "+diemArrayList.get(i).getMasv(), Toast.LENGTH_SHORT).show();
            }
        });

        btnsuadiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a=editdiemmasv.getText().toString();
                Float b=Float.parseFloat(editdiemtoan.getText().toString());
                Float c=Float.parseFloat(editdiemhoa.getText().toString());
                Float d=Float.parseFloat(editdiemly.getText().toString());
                Float tbc =(b+c+d)/3;

                diemArrayList.set(vitri,new Diem(a,b,c,d,tbc));
                adapter.notifyDataSetChanged();
                Toast.makeText(diemMain.this, "sửa sinh viên "+diemArrayList.get(vitri).getMasv() + " thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void xoa(){
        lvdiem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
                diemArrayList.remove(i);
                adapter.notifyDataSetChanged();
                Toast.makeText(diemMain.this, "xóa thành công", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private void back(){
        btnbackd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(diemMain.this, "Thoát thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void taomoi(){
        btntaomoidiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editdiemmasv.setText("");
                editdiemtoan.setText("");
                editdiemhoa.setText("");
                editdiemly.setText("");
                Toast.makeText(diemMain.this, "Mời nhập dữ liệu", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void anhxa(){
        btnthemdiem=findViewById(R.id.btnthemdiem);
        btnsuadiem=findViewById(R.id.btnsuadiem);
        btnbackd=findViewById(R.id.btnbackd);
        btntaomoidiem=findViewById(R.id.btntaomoidiem);

        lvdiem=findViewById(R.id.lvdiem);

        editdiemmasv=findViewById(R.id.editdiemmasv);
        editdiemtoan=findViewById(R.id.editdiemtoan);
        editdiemhoa=findViewById(R.id.editdiemhoa);
        editdiemly=findViewById(R.id.editdiemly);

        diemArrayList=new ArrayList<>();

        diemArrayList.add(new Diem("2ewq",(float)4.66, (float)7.5,(float)3.2,(float)3.2));
        diemArrayList.add(new Diem("31eew",(float)6.6, (float)7.5,(float)3.2,(float)3.2));

    }
}