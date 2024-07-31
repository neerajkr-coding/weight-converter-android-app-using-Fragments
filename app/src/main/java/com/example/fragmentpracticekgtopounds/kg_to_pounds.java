package com.example.fragmentpracticekgtopounds;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kg_to_pounds extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pounds_to_kg, container, false);

        EditText editText = view.findViewById(R.id.editText_kgtopound);
        Button button = view.findViewById(R.id.button_kg_to_pound);
        TextView textView = view.findViewById(R.id.textView_result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 String str = editText.getText().toString();

                 Double kg = Double.parseDouble(str);

                 Double pounds = kg * 2.20462;

                 textView.setText(pounds+" pounds");

            }
        });






        return view;
    }
}