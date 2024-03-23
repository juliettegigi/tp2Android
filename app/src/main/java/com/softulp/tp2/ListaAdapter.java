package com.softulp.tp2;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.softulp.tp2.databinding.ItemBinding;

import java.util.List;

public class ListaAdapter extends ArrayAdapter {
    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;


    public ListaAdapter(@NonNull Context context, int resource, @NonNull List objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context=context;
        this.lista=objects;
        this.li=li;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // recibe una posicion de la lista de inmueble, el item, el padre del item que es la listView
        //Este método retorna la vista del item, el layout del item
        View itemView=convertView;// el item, el layout
        if(itemView==null) {
            itemView=li.inflate(R.layout.item,parent,false);//
        }

        Inmueble inmueble=lista.get(position);

        // tengo que crear cada elemento del item, la iv y los 2 tv
        ImageView foto=itemView.findViewById(R.id.viImg);
        foto.setImageResource(inmueble.getImg());// le seteo la imagen pasandole el id de la foto;

        TextView tvDireccion=itemView.findViewById(R.id.tvDireccion);
        tvDireccion.setText(inmueble.getDireccion());

        TextView tvPrecio=itemView.findViewById(R.id.tvPrecio);
        tvPrecio.setText(inmueble.getPrecio()+"");

        return itemView;
    }
}
