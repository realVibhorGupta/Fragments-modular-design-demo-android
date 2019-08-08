package com.example.vibhor.fragmentmodulardesigndemo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    Comunicator comunicator;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        comunicator = (Comunicator) getActivity();


        listView = (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(getActivity(),
                R.array.titles,android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        comunicator.respond(position);


    }
}
