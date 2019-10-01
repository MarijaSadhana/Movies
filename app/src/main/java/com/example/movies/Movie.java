package com.example.movies;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

public class Movie implements Parcelable {

    public String url;
    public String title;
    public int year;
    public String genre;

    public Movie(String url, String title, int year, String genre) {
        this.url = url;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    protected Movie(Parcel in) {
        url = in.readString();
        title = in.readString();
        year = in.readInt();
        genre = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };


    @Override
    public int hashCode() {
        return Objects.hash(url, title, year, genre);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() { return year; }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeString(title);
        dest.writeInt(year);
        dest.writeString(genre);
    }
}
