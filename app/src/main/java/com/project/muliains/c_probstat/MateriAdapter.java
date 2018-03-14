package com.project.muliains.c_probstat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.muliains.c_probstat.Activity.MainActivity;
import com.project.muliains.c_probstat.Activity.MateriActivity;

import java.util.List;

/**
 * Created by Muliains on 07-Dec-17.
 */

public class MateriAdapter extends RecyclerView.Adapter<MateriAdapter.ViewHolder> {
    Context context;
    List<Materi> listMateri;
    Integer[] listImg;


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView judul,desc;
        public ImageView img;
        public Button btn;

        public ViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tv_judul);
            desc = itemView.findViewById(R.id.tv_desc);
            img = itemView.findViewById(R.id.iv_img);
            btn = itemView.findViewById(R.id.btn_read);
        }
    }

    public MateriAdapter(Context context, List<Materi> listMateri, Integer[] listImg) {
        this.context = context;
        this.listMateri = listMateri;
        this.listImg = listImg;

    }

    @Override
    public MateriAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.materi_card, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MateriAdapter.ViewHolder holder, int position) {
        Materi list = listMateri.get(position);
        holder.judul.setText(list.getJudul());
        holder.desc.setText(list.getDesc());
        holder.img.setImageResource(listImg[position]);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MateriActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }






    @Override
    public int getItemCount() {
        return listMateri.size();
    }


}
