package com.ofeq.recyclerviewfilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    /*
    * deklarasi RecyclerView
    * memasukkan adapter
    * membuat objek arraylist baru*/
    RecyclerView recyclerView;
    FilmRecyclerViewAdapter adapter;
    ArrayList<Film> objFilm = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //deklarasi objek pada activity_main
        recyclerView = findViewById(R.id.rcView);
        //menambah data baru pada list
        objFilm.add(new Film("The Raid 2", "Action,Crime,Thriller","Gareth Evans", " Only a short time after the first raid, Rama goes undercover with the thugs of Jakarta and plans to bring down the syndicate and uncover the corruption within his police force.", "2014", 8.0));
        objFilm.add(new Film("Si Doel Anak Sekolahan", "Comedy,Drama,Family", "Rano Karno", " Salah satu sinema lokal yang tayang di saluran tv komersil, menceritakan seorang pemuda betawi Bernama Kasdullah yang menempuh pendidikan dan setelah lulus sibuk mencari pekerjaan. Sinema ini juga bercerita tentang kisah antara Sarah, Jaenab dan Doel", "1992", 8.9));
        objFilm.add(new Film("Laskar Pelangi", "Adventure, Drama, Family", "Riri Riza", "In the 1970s, a group of 10 students struggles with poverty and develop hopes for the future in Gantong Village on the farming and tin mining island of Belitung off the east coast of Sumatra.", "2008", 7.8));
        objFilm.add(new Film("Ada Apa Dengan Cinta?" ,"Drama, Romance ", "Rudy Soedjarwo", "A popular girl has to choose whether she wants to stay as a part of her clique or fall for the brooding literature-loving boy in her school.", "2002",7.7 ));
        objFilm.add(new Film("Habiebie & Ainun", "Biography, Drama, Romance", "Faozan Rizal", "This movie is based on the memoir written by the 3rd President of Indonesia and one of the world-famous engineer, B.J. Habibie about his wife, Hasri Ainun Habibie.","2012",7.6));
        objFilm.add(new Film("Tenggelamnya Kapal Van Der Wicjk", "Drama, Romance", "Sunil Soraya", "Adapted from a classic novel with the same title, the movie tells a love story between Zainuddin, Hayati, and Aziz. With the difference in social background lead Zainuddin and Hayati's true love to a tragedy on sailing Van Der Wijck ship.", "2013", 7.6));



        adapter = new FilmRecyclerViewAdapter(objFilm);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}