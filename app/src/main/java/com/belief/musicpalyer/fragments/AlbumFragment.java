package com.belief.musicpalyer.fragments;

import static com.belief.musicpalyer.MainActivity.musicFiles;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.belief.musicpalyer.AlbumAdapter;
import com.belief.musicpalyer.MusicAdapter;
import com.belief.musicpalyer.R;

public class AlbumFragment extends Fragment {

    RecyclerView recyclerView;
   AlbumAdapter albumAdapter;



    public AlbumFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_album_frag);
        recyclerView.setHasFixedSize(true);
        if (!(musicFiles.size()<1)){
            albumAdapter = new AlbumAdapter(getContext(),musicFiles);
            recyclerView.setAdapter(albumAdapter);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        }
        return view;
    }
}