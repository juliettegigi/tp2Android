package com.softulp.tp2;

import android.app.Application;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.softulp.tp2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {
private ArrayList<Inmueble> listaInmuebles;
private ActivityMainBinding binding;
private  LayoutInflater li;
    public MainActivityViewModel(@NonNull Application application,LayoutInflater li, ActivityMainBinding binding) {
        super(application);
        this.binding=binding;
        this.li=li;
        listaInmuebles=new ArrayList<>();
        cargarDatos();
        generarListView();
    }

    public void cargarDatos(){
        listaInmuebles.add(new Inmueble(R.drawable.juli,"Juliland",200f));
        listaInmuebles.add(new Inmueble(R.drawable.takamurao,"Ipoland",200f));
        listaInmuebles.add(new Inmueble(R.drawable.takamurao0,"TakamuraLand",200f));
    }
    public void generarListView(){
        ArrayAdapter<Inmueble> adapter=new ListaAdapter(getApplication(),R.layout.item,listaInmuebles, li);
        binding.lvLista.setAdapter(adapter);
    }
}
