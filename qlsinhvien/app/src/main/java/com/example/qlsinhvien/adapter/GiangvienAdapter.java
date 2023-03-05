package com.example.qlsinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.qlsinhvien.R;
import com.example.qlsinhvien.model.GiangVien;

import java.util.List;

public class GiangvienAdapter extends BaseAdapter {
    private Context context ;
    private int layout ;
    private List<GiangVien> listgv ;

    public GiangvienAdapter(Context context, int layout, List<GiangVien> listgv) {
        this.context = context;
        this.layout = layout;
        this.listgv = listgv;
    }

    @Override
    public int getCount() {
        return listgv.size();
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

        TextView tvmagv ,tvtengv , tvdiachigv , tvsodtgv ;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        viewholder viewholder ;

        if (view==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            viewholder=new viewholder();

            viewholder.tvmagv=(TextView)view.findViewById(R.id.tvmagv);
            viewholder.tvtengv=(TextView)view.findViewById(R.id.tvtengv);
            viewholder.tvdiachigv=(TextView)view.findViewById(R.id.tvdiachigv);
            viewholder.tvsodtgv=(TextView)view.findViewById(R.id.tvsodtgv);

            view.setTag(viewholder);

        }else{
            viewholder=(viewholder) view.getTag();
        }

        GiangVien gv=listgv.get(i);

        viewholder.tvmagv.setText(gv.getMagv());
        viewholder.tvtengv.setText(gv.getTengv());
        viewholder.tvdiachigv.setText(gv.getDiachigv());
        viewholder.tvsodtgv.setText(gv.getSodtgv()+"");


        return view;
    }
}
