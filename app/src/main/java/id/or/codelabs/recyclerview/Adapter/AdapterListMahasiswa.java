package id.or.codelabs.recyclerview.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.or.codelabs.recyclerview.Model.ModelMahasiswa;
import id.or.codelabs.recyclerview.R;

/**
 * Created by bayu on 27/11/15.
 */
public class AdapterListMahasiswa extends RecyclerView.Adapter<AdapterListMahasiswa.ViewHolderAnggota> {

    private ArrayList<ModelMahasiswa> mhs;

    public AdapterListMahasiswa(ArrayList<ModelMahasiswa> mhs) {
        this.mhs = mhs;
    }

    @Override
    public ViewHolderAnggota onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_listmahasiswa,null);
        ViewHolderAnggota view = new ViewHolderAnggota(viewItem);
        return view;
    }

    @Override
    public void onBindViewHolder(ViewHolderAnggota holder, int position) {
        holder.namaAnggota.setText(mhs.get(position).getNama());
        holder.nim.setText(mhs.get(position).getNim());
        holder.fotoProfil.setImageResource(mhs.get(position).getFoto());
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderAnggota extends RecyclerView.ViewHolder {
        public ImageView fotoProfil;
        public TextView namaAnggota;
        public TextView nim;

        public ViewHolderAnggota(View itemView) {
            super(itemView);
            fotoProfil = (ImageView) itemView.findViewById(R.id.img_fotoprofil);
            namaAnggota = (TextView) itemView.findViewById(R.id.text_nama);
            nim = (TextView) itemView.findViewById(R.id.text_nim);
        }
    }
}
