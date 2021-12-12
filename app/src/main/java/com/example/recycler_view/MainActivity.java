package com.example.recycler_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends RecyclerView.Adapter<myRecyclerViewAdapter.MyViewHolder> {

    ImageView imageViewFriend;
    TextView textViewFriendName;
    TextView textViewdateFriend;
    TextView textViewCity;
    Friends data;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewFriend = itemView.findViewById(R.id.imageViewFriendPicture);
        textViewFriendName = itemView.findViewById(R.id.textViewFriendName);
        textViewdateFriend = itemView.findViewById(R.id.textViewDate);
        textViewCity = itemView.findViewById(R.id.textViewCity);
    }

    
}