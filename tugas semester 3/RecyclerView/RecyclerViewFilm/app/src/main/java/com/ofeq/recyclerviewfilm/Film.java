package com.ofeq.recyclerviewfilm;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    //data pojo
    private  String titleF, genre,director,deskripsi,realeaseDate;
    private double rating;

    //constuctor
    public Film(String titleF, String genre, String director, String deskripsi, String realeaseDate, double rating) {
        this.titleF = titleF;
        this.genre = genre;
        this.director = director;
        this.deskripsi = deskripsi;
        this.realeaseDate = realeaseDate;
        this.rating = rating;

    }

    //getter and setter
    public String getTitleF() {
        return titleF;
    }

    public void setTitleF(String titleF) {
        this.titleF = titleF;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(String realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.titleF);
        dest.writeString(this.genre);
        dest.writeString(this.director);
        dest.writeString(this.deskripsi);
        dest.writeString(this.realeaseDate);
        dest.writeDouble(this.rating);
    }

    public void readFromParcel(Parcel source) {
        this.titleF = source.readString();
        this.genre = source.readString();
        this.director = source.readString();
        this.deskripsi = source.readString();
        this.realeaseDate = source.readString();
        this.rating = source.readDouble();
    }

    protected Film(Parcel in) {
        this.titleF = in.readString();
        this.genre = in.readString();
        this.director = in.readString();
        this.deskripsi = in.readString();
        this.realeaseDate = in.readString();
        this.rating = in.readDouble();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
