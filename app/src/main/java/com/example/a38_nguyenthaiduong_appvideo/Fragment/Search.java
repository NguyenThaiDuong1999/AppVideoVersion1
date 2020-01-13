package com.example.a38_nguyenthaiduong_appvideo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a38_nguyenthaiduong_appvideo.Mainactivity.MainActivity;
import com.example.a38_nguyenthaiduong_appvideo.R;
import com.example.a38_nguyenthaiduong_appvideo.databinding.SearchBinding;
import com.example.a38_nguyenthaiduong_appvideo.databinding.SearchBindingImpl;

public class Search extends Fragment {

    SearchBinding binding;

    public static Search newInstance() {

        Bundle args = new Bundle();

        Search fragment = new Search();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.search, container, false);
        binding.imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}
