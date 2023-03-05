package com.example.qlsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.qlsinhvien.adapter.GiangvienAdapter;
import com.example.qlsinhvien.model.GiangVien;

import java.util.ArrayList;

public class GiangvienMain extends AppCompatActivity {

    ListView lvgiangvien ;
    ArrayList<GiangVien> giangVienArrayList ;
    GiangvienAdapter adapter ;

    int vitri=-1 ;
    Button btnthemgv , btnsuagv , btntaomoigv , btnthoatgv ;
    EditText editmagv , edittengv , editdiachigv , editsodtgv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giangvien_main);
        anhxa();
        them();
        sua();
        taomoi();
        thoat();
        adapter=new GiangvienAdapter(this,R.layout.dong_giang_vien,giangVienArrayList);
        lvgiangvien.setAdapter(adapter);

    }

    private void thoat() {
        btnthoatgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(GiangvienMain.this, "Thoát thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void sua() {
        lvgiangvien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                vitri=i ;

                editmagv.setText(giangVienArrayList.get(i).getMagv());
                edittengv.setText(giangVienArrayList.get(i).getTengv());
                editdiachigv.setText(giangVienArrayList.get(i).getDiachigv());
                editsodtgv.setText(giangVienArrayList.get(i).getSodtgv()+"");
                Toast.makeText(GiangvienMain.this, "Đã chọn sửa giảng viên "+giangVienArrayList.get(i).getTengv(), Toast.LENGTH_SHORT).show();


            }
        });

        btnsuagv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editmagv.getText().toString() ;
                String b =edittengv.getText().toString();
                String c=editdiachigv.getText().toString() ;
                int d=Integer.parseInt(editsodtgv.getText().toString());

                giangVienArrayList.set(vitri, new GiangVien(a,b,c,d));
                Toast.makeText(GiangvienMain.this, "đã sửa "+giangVienArrayList.get(vitri).getTengv()+ " thành công", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void taomoi(){
        btntaomoigv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editmagv.setText("");
                edittengv.setText("");
                editdiachigv.setText("");
                editsodtgv.setText("");
                Toast.makeText(GiangvienMain.this, "mời nhập dữ liệu mới", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void them() {
        btnthemgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editmagv.getText().toString() ;
                String b =edittengv.getText().toString();
                String c=editdiachigv.getText().toString() ;
                int d=Integer.parseInt(editsodtgv.getText().toString());

                giangVienArrayList.add(new GiangVien(a,b,c,d));
                Toast.makeText(GiangvienMain.this, "Thêm "+a+" thành công", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void anhxa() {
        btnthemgv=findViewById(R.id.btnthemgv);
        btnsuagv=findViewById(R.id.btnsuagv);
        btntaomoigv=findViewById(R.id.btntaomoigv);
        btnthoatgv=findViewById(R.id.btnthoatgv);


        editmagv=findViewById(R.id.editmagv);
        edittengv=findViewById(R.id.edittengv);
        editdiachigv=findViewById(R.id.editdiachigv);
        editsodtgv=findViewById(R.id.editsodtgv);


        lvgiangvien=findViewById(R.id.lvgiangvien);

        giangVienArrayList=new ArrayList<>();
        giangVienArrayList.add(new GiangVien("e2e2","thhuthu","tiên yên",021546));
        giangVienArrayList.add(new GiangVien("e2e2","thhuthu","tiên yên",021546));
        giangVienArrayList.add(new GiangVien("e2e2","thhuthu","tiên yên",021546));
    }


}