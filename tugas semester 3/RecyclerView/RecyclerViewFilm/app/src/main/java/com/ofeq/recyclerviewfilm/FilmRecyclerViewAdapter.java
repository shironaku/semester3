package com.ofeq.recyclerviewfilm;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmRecyclerViewAdapter extends RecyclerView.Adapter<FilmRecyclerViewAdapter.FilmViewHolder> {

    //membuat arraylist
    ArrayList<Film> arrayListFilm;

    public FilmRecyclerViewAdapter(ArrayList<Film> arrayListFilm) {
        this.arrayListFilm = arrayListFilm;
    }

    @NonNull
    @Override
    public FilmRecyclerViewAdapter.FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_datafilm,parent,false);

        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmRecyclerViewAdapter.FilmViewHolder holder, int position) {

        //untuk get data dari tiap objek pada array list
        final Film film = arrayListFilm.get(position);
        //settext nilai yang tersimpan di array list
        holder.textViewJudul.setText(film.getTitleF());
        holder.textViewRating.setText(String.valueOf(film.getRating()));
        holder.textViewRilis.setText(film.getRealeaseDate());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //melempar nilai dengan intent agar diatangkap oleh film
                Intent intent = new Intent(holder.itemView.getContext(), DetailFilmActivity.class );
                //mengambil kode FILM yang sama dengan DetailFilmActivity
                intent.putExtra("FILM", film);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayListFilm.size();
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder {
       // deklarasi view yang ada di item
        TextView textViewJudul, textViewRating,textViewRilis;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);

            //inisialisasi textView
            textViewJudul = itemView.findViewById(R.id.titleF);
            textViewRating = itemView.findViewById(R.id.rating);
            textViewRilis = itemView.findViewById(R.id.realeaseDate);

        }
    }
}
