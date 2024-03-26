package com.softulp.tp2.entidades;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.softulp.tp2.R;
import com.softulp.tp2.databinding.ItemBinding;
import com.softulp.tp2.entidades.Inmueble;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Inmueble> {
    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;


    public ListaAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.lista=objects;
        this.li=LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View itemView, @NonNull ViewGroup listView) {

        ItemBinding binding;
        if (itemView == null) {
            binding = ItemBinding.inflate(li, listView, false);
        } else {
            binding = ItemBinding.bind(itemView);
        }

        Inmueble inmueble = lista.get(position);
        binding.viImg.setImageResource(inmueble.getImg());
        binding.tvDireccion.setText(inmueble.getDireccion());
        binding.tvPrecio.setText(String.valueOf(inmueble.getPrecio()));

        return binding.getRoot();
    }

    public int getCount(){
        return lista.size();
    }
}
