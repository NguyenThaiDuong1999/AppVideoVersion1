package com.example.a38_nguyenthaiduong_appvideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a38_nguyenthaiduong_appvideo.databinding.SearchMusicBinding;

public class Search_Music extends Fragment {

    SearchMusicBinding binding;

    public static Search_Music newInstance() {

        Bundle args = new Bundle();

        Search_Music fragment = new Search_Music();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.search_music, container, false);

        return binding.getRoot();
    }
}
