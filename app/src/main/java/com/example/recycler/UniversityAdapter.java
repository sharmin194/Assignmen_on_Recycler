package com.example.recycler;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder> {

    private List<University> universityList;

    public UniversityAdapter(List<University> universityList) {
        this.universityList = universityList;
    }

    @NonNull
    @Override
    public UniversityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.university_item, parent, false);
        return new UniversityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UniversityViewHolder holder, int position) {
        University university = universityList.get(position);
        holder.universityName.setText(university.getName());
        holder.universityImage.setImageResource(university.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return universityList.size();
    }

    public static class UniversityViewHolder extends RecyclerView.ViewHolder {
        TextView universityName;
        ImageView universityImage;

        public UniversityViewHolder(@NonNull View itemView) {
            super(itemView);
            universityName = itemView.findViewById(R.id.universityName);
            universityImage = itemView.findViewById(R.id.universityImage);
        }
    }
}
