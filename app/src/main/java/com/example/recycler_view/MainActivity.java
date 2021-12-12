package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends RecyclerView.Adapter<myRecyclerViewAdapter.MyViewHolder> {


        public myRecyclerViewAdapter(List<Friends> friendsList) {
            this.friendsList = friendsList;
    }
}