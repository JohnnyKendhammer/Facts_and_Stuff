package com.kendhammer.john.factsandstuff.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kendhammer.john.factsandstuff.R;
import com.kendhammer.john.factsandstuff.model.Fact;
import com.kendhammer.john.factsandstuff.model.lists.ListOfFacts;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class FactFragment extends Fragment {
    private TextView tvFact;

    public FactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fact, container, false);
        final ArrayList<Fact> facts = new ListOfFacts().getFacts();

        tvFact = view.findViewById(R.id.tv_fact);
        //Sets the first fact
        setFact(facts);

        tvFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFact(facts);
            }
        });

        return view;
    }

    private void setFact(ArrayList<Fact> facts) {
        Random rand = new Random();
        Fact fact = facts.get(rand.nextInt(facts.size()));
        tvFact.setText(fact.getFact() + "\n\n" + fact.getDescription());
    }

}
