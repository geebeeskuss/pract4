package com.example.pract4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pract4.databinding.FragmentRecyclerBinding;

import java.util.ArrayList;


public class RecyclerFragment extends Fragment {
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
        FragmentRecyclerBinding binding = FragmentRecyclerBinding.inflate(getLayoutInflater());

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerView.setAdapter(new RecyclerAdapter(Items(), requireContext()));
        return binding.getRoot();
    }
}