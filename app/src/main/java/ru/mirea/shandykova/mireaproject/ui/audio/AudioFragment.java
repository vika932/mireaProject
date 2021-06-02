package ru.mirea.shandykova.mireaproject.ui.audio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ru.mirea.shandykova.mireaproject.R;

public class AudioFragment extends Fragment {
    Button buttonPlay;
    Button buttonStop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_audio, container, false);
        buttonPlay = root.findViewById(R.id.button_play);
        buttonStop = root.findViewById(R.id.button_stop);
        View.OnClickListener playClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getContext(), AudioService.class));
            }
        };

        buttonPlay.setOnClickListener(playClickListener);


        View.OnClickListener stopClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getContext(), AudioService.class));
            }
        };

        buttonStop.setOnClickListener(stopClickListener);
        return root;
    }
}