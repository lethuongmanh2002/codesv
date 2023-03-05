package com.example.qlsinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsinhvien.R;
import com.example.qlsinhvien.model.SinhVien;

import java.util.List;

public class SinhvienAdapter extends BaseAdapter {

    private Context context ;
    private int Layout ;
    private List<SinhVien> sinhVienList ;

    public SinhvienAdapter(Context context, int layout, List<SinhVien> sinhVienList) {
        this.context = context;
        Layout = layout;
        this.sinhVienList = sinhVienList;
    }


    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class viewholder{
        TextView tvmasv ,tvtensv ,tvngaysinh , tvsodt , tvdiachi ;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

            viewholder viewholder ;

            if (view==null){
                LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                view=inflater.inflate(Layout , null) ;

                viewholder =new viewholder();

                viewholder.tvmasv=(TextView)view.findViewById(R.id.tvmasv);
                viewholder.tvtensv=(TextView)view.findViewById(R.id.tvtensv);
                viewholder.tvngaysinh=(TextView)view.findViewById(R.id.tvngaysinh);
                viewholder.tvsodt=(TextView)view.findViewById(R.id.tvsodt);
                viewholder.tvdiachi=(TextView)view.findViewById(R.id.tvdiachi);
                view.setTag(viewholder);
            }else{
                viewholder=(viewholder) view.getTag();
            }

            SinhVien sv=sinhVienList.get(i);

            viewholder.tvmasv.setText(sv.getMassv());
            viewholder.tvtensv.setText(sv.getTensv());
            viewholder.tvngaysinh.setText(sv.getNgaysinh());
            viewholder.tvsodt.setText(sv.getSodt());
            viewholder.tvdiachi.setText(sv.getDiachi());


        return view;
    }
}
