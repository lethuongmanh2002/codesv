package com.example.qlsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.qlsinhvien.adapter.SinhvienAdapter;
import com.example.qlsinhvien.model.SinhVien;

import java.util.ArrayList;

public class sinhVienMain extends AppCompatActivity {




    ArrayList<SinhVien> arraysinhvien ;

    SinhvienAdapter adapter ;

    EditText editmasv , editten , editngaysinh , editsodt , editdiachi ;
    Button btnthem , btnsua , btntaomoi  , btnback ;
    ListView lvsinhvien ;

    int vitri=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhvien);

        anhxa();
        them();
        sua();
        xoa();
        taomoi();
        trolai();
        adapter=new SinhvienAdapter(this,R.layout.dong_sinh_vien , arraysinhvien);
        lvsinhvien.setAdapter(adapter);


    }

    private void them (){
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a=editmasv.getText().toString();
                String b=editten.getText().toString() ;
                String c=editngaysinh.getText().toString();
                String d=editsodt.getText().toString() ;
                String e=editdiachi.getText().toString();


                if(a.toString().equals("") || b.toString().equals("") || c.toString().equals("") || d.toString().equals("") || e.toString().equals("")){ // kiểm tra text không được bỏ trống
                    Toast.makeText(sinhVienMain.this, "yêu cầu nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }else {
                    arraysinhvien.add(new SinhVien(a,b,c,d,e));
                    adapter.notifyDataSetChanged();
                    Toast.makeText(sinhVienMain.this, "Đã thêm sinh viên " +b+" thành công", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }


    private void sua(){
        lvsinhvien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editmasv.setText(arraysinhvien.get(i).getMassv());
                editten.setText(arraysinhvien.get(i).getTensv());
                editngaysinh.setText(arraysinhvien.get(i).getNgaysinh());
                editsodt.setText(arraysinhvien.get(i).getSodt());
                editdiachi.setText(arraysinhvien.get(i).getDiachi());
                vitri=i;
                Toast.makeText(sinhVienMain.this, "Bạn đang chọn sủa "+arraysinhvien.get(i).getTensv(), Toast.LENGTH_SHORT).show();

            }
        });

        btnsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a=editmasv.getText().toString();
                String b=editten.getText().toString() ;
                String c=editngaysinh.getText().toString();
                String d=editsodt.getText().toString() ;
                String e=editdiachi.getText().toString();

                arraysinhvien.set(vitri,new SinhVien(a,b,c,d,e));
                adapter.notifyDataSetChanged();
                Toast.makeText(sinhVienMain.this, "Đã sửa thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void xoa(){
        lvsinhvien.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
                arraysinhvien.remove(i);
                adapter.notifyDataSetChanged();
                Toast.makeText(sinhVienMain.this, "Đã xóa thành công", Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }

    private void taomoi(){
        btntaomoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editmasv.setText("");
                editten.setText("");
                editngaysinh.setText("");
                editsodt.setText("");
                editdiachi.setText("");
            }
        });
    }

    private void trolai (){
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    private void anhxa(){

        editmasv=findViewById(R.id.editdiemmasv);
        editten=findViewById(R.id.editten);
        editngaysinh=findViewById(R.id.editngaysinh);
        editsodt=findViewById(R.id.editsodt);
        editdiachi=findViewById(R.id.edtdiachi);

        lvsinhvien=findViewById(R.id.lvsinhvien);

        btnthem=findViewById(R.id.btnthem);
        btnsua=findViewById(R.id.btnsua) ;
        btntaomoi=findViewById(R.id.btntaomoi);
        btnback=findViewById(R.id.btnback);


        arraysinhvien=new ArrayList<>();
        arraysinhvien.add(new SinhVien("t01a","thương","06/12/2002","4561234","tiên yên"));
        arraysinhvien.add(new SinhVien("rre23","mạnh","23/02/1999","4561234","thành phố hà nội"));
        arraysinhvien.add(new SinhVien("fsdf23","lê","24/12/2003","4561234","vân đồn"));
        arraysinhvien.add(new SinhVien("bdg45","nguyễn","13/12/2000","4561234","móng cái"));
    }
}