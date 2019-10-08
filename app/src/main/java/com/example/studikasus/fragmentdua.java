package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentdua extends Fragment {

    View yuli;//membuat fariabel global

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        yuli = inflater.inflate(R.layout.activity_fragmentdua, container, false);//cara memanggil tampilan fragmentDua
        return yuli;
        //menghbungan fragment 2
    }
}

