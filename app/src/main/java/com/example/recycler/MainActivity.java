package com.example.recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<University> universityList = new ArrayList<>();
        universityList.add(new University("Leading University", R.drawable.lu));
        universityList.add(new University("Buet", R.drawable.buet));
        universityList.add(new University("SUST", R.drawable.sust));
        universityList.add(new University("University of Dhaka", R.drawable.du));
        universityList.add(new University("Rajshahi University ", R.drawable.rajshahi));
        universityList.add(new University("NSU", R.drawable.nsu));
        universityList.add(new University("Metropoliton University", R.drawable.metro));
        universityList.add(new University("BRAC University", R.drawable.brac));
        universityList.add(new University("East West University", R.drawable.ewu));
        universityList.add(new University("Independent University, Bangladesh", R.drawable.iub));
        universityList.add(new University("American International University-Bangladesh", R.drawable.aiub));


        UniversityAdapter adapter = new UniversityAdapter(universityList);
        recyclerView.setAdapter(adapter);
    }
}
