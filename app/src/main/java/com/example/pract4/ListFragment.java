package com.example.pract4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pract4.databinding.FragmentListBinding;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    public static ArrayList<String> Items() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            list.add("мяукни " + (i + 1)+" раз");
        }
        return list;
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentListBinding binding = FragmentListBinding.inflate(getLayoutInflater());
        binding.listView.setAdapter(
                new ListViewAdapter(
                        requireContext(),
                        R.layout.item_list,
                        Items()
                )
        );
        binding.listView.setOnItemClickListener((parent, v, position, id) -> {
            Toast.makeText(requireContext(), "meow ListView", Toast.LENGTH_LONG).show();
        });

        return binding.getRoot();
    }
}