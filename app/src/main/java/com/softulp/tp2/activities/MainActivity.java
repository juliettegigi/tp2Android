package com.softulp.tp2.activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.softulp.tp2.viewModels.MainActivityViewModel;
import com.softulp.tp2.databinding.ActivityMainBinding;
import com.softulp.tp2.entidades.Inmueble;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm=new MainActivityViewModel(getApplication(),getLayoutInflater());

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm.getMutableAdapter().observe(this, new Observer<ArrayAdapter<Inmueble>>() {
            @Override
            public void onChanged(ArrayAdapter<Inmueble> inmuebleArrayAdapter) {
                binding.lvLista.setAdapter(inmuebleArrayAdapter);
            }
        });
       // vm.getAdapter();

    }
}