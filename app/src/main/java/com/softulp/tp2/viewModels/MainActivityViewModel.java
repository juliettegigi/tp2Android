package com.softulp.tp2.viewModels;

import android.app.Application;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.softulp.tp2.entidades.ListaAdapter;
import com.softulp.tp2.R;
import com.softulp.tp2.entidades.Inmueble;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {
private ArrayList<Inmueble> listaInmuebles;
//private MutableLiveData<ArrayList<Inmueble>> mutableListaInmuebles ;
private MutableLiveData<ArrayAdapter<Inmueble>> mutableAdapter;

private  LayoutInflater li;
    public MainActivityViewModel(@NonNull Application application,LayoutInflater li) {
        super(application);
        this.li=li;
        listaInmuebles=new ArrayList<>();
        //cargarDatos();
    }

    public MutableLiveData<ArrayAdapter<Inmueble>> getMutableAdapter() {
        if(mutableAdapter==null){
            mutableAdapter = new MutableLiveData<>();
            cargarDatos();
            ArrayAdapter<Inmueble> adapter=new ListaAdapter(getApplication(), R.layout.item,listaInmuebles, li);
            mutableAdapter.setValue(adapter);
        }
        return mutableAdapter;
    }

    public void cargarDatos(){
        listaInmuebles.add(new Inmueble(R.drawable.juli,"Juliland",200f));
        listaInmuebles.add(new Inmueble(R.drawable.takamurao,"Ipoland",200f));
        listaInmuebles.add(new Inmueble(R.drawable.takamurao0,"TakamuraLand",200f));
    }

}
