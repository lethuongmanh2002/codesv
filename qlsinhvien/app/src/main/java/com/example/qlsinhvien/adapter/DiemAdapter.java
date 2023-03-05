package com.example.qlsinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsinhvien.R;
import com.example.qlsinhvien.model.Diem;

import java.util.List;

public class DiemAdapter extends BaseAdapter {

    private Context context ;
    private int layout ;
    private List<Diem> diemList ;

    public DiemAdapter(Context context, int layout, List<Diem> diemList) {
        this.context = context;
        this.layout = layout;
        this.diemList = diemList;
    }

    @Override
    public int getCount() {
        return diemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class viewholder{
        TextView tvmasv ,  tvdiemtoan , tvdiemhoa ,tvdiemly , tvtbc  ;
    }
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        viewholder viewholder ;

        if (view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout , null) ;

            viewholder =new viewholder();

            viewholder.tvmasv=(TextView)view.findViewById(R.id.tvmasv);
            viewholder.tvdiemtoan=(TextView)view.findViewById(R.id.tvdiemtoan);
            viewholder.tvdiemhoa=(TextView)view.findViewById(R.id.tvdiemhoa);
            viewholder.tvdiemly=(TextView)view.findViewById(R.id.tvdiemly);
            viewholder.tvtbc=(TextView)view.findViewById(R.id.tvtbc);
            view.setTag(viewholder);
        }else{
            viewholder=(viewholder) view.getTag();
        }

        Diem d=diemList.get(i);

        viewholder.tvmasv.setText(d.getMasv());
        viewholder.tvdiemtoan.setText(d.getDiemtoan()+""); // để khoảng trắng để hiện theo kiểu string
        viewholder.tvdiemhoa.setText(d.getDiemhoa()+"");
        viewholder.tvdiemly.setText(d.getDiemly()+"");
        viewholder.tvtbc.setText(d.getTbc()+"");


        return view;
    }
}
