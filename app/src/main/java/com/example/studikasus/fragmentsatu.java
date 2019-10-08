package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fragmentsatu extends Fragment {

    View yuli;//membuat fariabel global
    EditText editText1;
    TextView textView;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        yuli = inflater.inflate(R.layout.activity_fragmentsatu, container, false);//cara memanggil tampilan fragmentSatu

        editText1 = yuli.findViewById(R.id.edtText);
        textView = yuli.findViewById(R.id.textview1);
        button = yuli.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText1.getText().toString();
                input = input.toLowerCase();
                String[] arrayInput = input.split(" ");
                String hasil = "";
                for(int i = arrayInput.length-1; i > 0; i-- )//membuat luping untu masuk ke array
                {
                    System.out.println(arrayInput[i]);
                    if (arrayInput[i].equals("bohong")){
                        arrayInput[i-1] = malek(arrayInput[i-1]);

                    }
                    hasil = arrayInput[0];//kenapa di luar if di dalam for ?
                }

                textView.setText(hasil);
            }
        });

        return yuli;//menghbungan fragment 1
    }

    public String malek(String inputan) {
        String resault ="";
        if (inputan.equals("bohong")) //jka string gunakan equals, jika int / float gunakan "=="
        {
            resault = "jujur";

        }else {
            resault = "bohong";
        }

        return resault;
    }
}

