package com.ofeq.recyclerviewfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFilmActivity extends AppCompatActivity {

    //deklarasi textView yang  mengacu pada activity_detail_film.xml
    TextView textViewTitle,textViewRating,textViewRealeaseDate, textViewGenre,textViewDirector,textViewDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);


        //inisialisasi  id pada activity_detail_film.xml agar data yang diambil sesuai
        textViewTitle = findViewById(R.id.titleF);
        textViewRating = findViewById(R.id.rating);
        textViewRealeaseDate = findViewById(R.id.realeaseDate);
        textViewGenre = findViewById(R.id.genre);
        textViewDirector = findViewById(R.id.director);
        textViewDescription = findViewById(R.id.deskripsi);


        //memanggil data intent, membuat kode FILM agar dapat dipanggil dari FilmRecyclerViewAdapter
        Film film = getIntent().getParcelableExtra("FILM");
        textViewTitle.setText(film.getTitleF());
        textViewRating.setText(String.valueOf(film.getRating()));
        textViewGenre.setText(film.getGenre());
        textViewRealeaseDate.setText(film.getRealeaseDate());
        textViewDirector.setText(film.getDirector());
        textViewDescription.setText(film.getDeskripsi());


    }
}