package com.example.vibhor.fragmentmodulardesigndemo;


import android.app.FragmentManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    @Override
    public void respond(int position)
    {

        FragmentManager fragmentManager=getFragmentManager();
        FragmentB fragmentB= (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
        fragmentB.changeData(position);

    }
}
