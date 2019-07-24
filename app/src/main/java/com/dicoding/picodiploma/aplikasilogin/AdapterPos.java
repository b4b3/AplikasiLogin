package com.dicoding.picodiploma.aplikasilogin;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class AdapterPos extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    private Context context;
    private LayoutInflater inflater;
    List<DataPos> data = Collections.emptyList();
    DataPos current;

    public AdapterPos(Context context, List<DataPos> data){
        this.context=context;
        inflater = LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= inflater.inflate(R.layout.container_pos, parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        MyHolder myHolder = (MyHolder) holder;
        DataPos current =data.get(position);
        myHolder.textNama.setText(current.nama);
        myHolder.textAlamat.setText("Alamat: "+ current.alamat);
        myHolder.textKecamatan.setText("Kecamatan : "+ current.kecamatan);
        myHolder.textKota.setText("Kota : "+ current.kota);
        myHolder.textKeterangan.setText("Keterangan : "+ current.keterangan);
        myHolder.textPenerima.setText("Penerima : "+ current.penerima);

    }

    @Override
    public int getItemCount(){
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textNama;
        TextView textAlamat;
        TextView textKecamatan;
        TextView textKota;
        TextView textKeterangan;
        TextView textPenerima;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textNama= (TextView) itemView.findViewById(R.id.textNama);
            textAlamat = (TextView) itemView.findViewById(R.id.textAlamat);
            textKecamatan = (TextView) itemView.findViewById(R.id.textKecamatan);
            textKota = (TextView) itemView.findViewById(R.id.textKota);
            textKeterangan = (TextView) itemView.findViewById(R.id.textKeterangan);
            textPenerima = (TextView) itemView.findViewById(R.id.textPenerima);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(context, "You clicked an item", Toast.LENGTH_SHORT).show();

        }

}
