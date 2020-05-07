package com.example.busanapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;

public class HomeFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //recycleView 초기화
        recyclerView = (RecyclerView) view.findViewById(R.id.PhotoRecycler);

        //가로 레이아웃
        LinearLayoutManager horizonalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        //레이아웃 매니저 연결
        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        //아이템 로드
        adapter.setItems(new ImageData().getItems());

        return view;
    }
}