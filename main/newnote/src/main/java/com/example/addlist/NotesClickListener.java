package com.example.addlist;

import androidx.cardview.widget.CardView;

import com.example.addlist.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
