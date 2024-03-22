package com.example.pract4;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.pract4.databinding.FragmentButtonsBinding;


public class ButtonsFragment extends Fragment {
    public ButtonsFragment(){
        super(R.layout.fragment_buttons);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentButtonsBinding binding = FragmentButtonsBinding.inflate(inflater,container,false);
        binding.button1.setOnClickListener(view -> {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(
                            R.id.main_fragment_container,
                            ListFragment.class,
                            null
                    )
                    .addToBackStack(null)
                    .commit();
        });
        binding.button2.setOnClickListener(view -> {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(
                            R.id.main_fragment_container,
                            RecyclerFragment.class,
                            null
                    )
                    .addToBackStack(null)
                    .commit();
        });
        return binding.getRoot();
    }
}