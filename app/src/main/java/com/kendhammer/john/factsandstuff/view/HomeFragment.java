package com.kendhammer.john.factsandstuff.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kendhammer.john.factsandstuff.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private OnClickListenerAction onClickListenerAction;
    private Button btnQuotes;
    private Button btnJokes;
    private Button btnAffirmations;
    private Button btnFacts;

    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnQuotes = view.findViewById(R.id.btnQuotes);
        btnJokes = view.findViewById(R.id.btnJokes);
        btnAffirmations = view.findViewById(R.id.btnAffirmation);
        btnFacts = view.findViewById(R.id.btnFacts);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerAction.loadJokes();
            }
        });

        btnFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerAction.loadFacts();
            }
        });

        btnAffirmations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerAction.loadAffirmations();
            }
        });

        btnQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerAction.loadQuotes();
            }
        });
    }

    public interface OnClickListenerAction {
        void loadQuotes();

        void loadJokes();

        void loadFacts();

        void loadAffirmations();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnClickListenerAction) {
            onClickListenerAction = (OnClickListenerAction) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnClickListenerAction");
        }
    }
}
