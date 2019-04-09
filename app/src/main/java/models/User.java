package models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{

    private String profile_image;
    private String name;
    private String favorite_genre;
    private String favorite_movies;
    private String favorite_comments;
    private String favorite_reviews;

    public User() {
    }

    protected User(Parcel in){
        profile_image = in.readString();
        name = in.readString();
        favorite_genre = in.readString();
        favorite_movies = in.readString();
        favorite_comments = in.readString();
        favorite_reviews = in.readString();
    }

    private static final Parcelable.ClassLoaderCreator CREATOR = new Parcelable.ClassLoaderCreator() {
        @Override
        public Object createFromParcel(Parcel source, ClassLoader loader) {
            return null;
        }

        @Override
        public Object createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public Object[] newArray(int size) {
            return new Object[0];
        }

    };

    public User(String profile_image, String name, String favorite_genre, String favorite_movies, String favorite_comments, String favorite_reviews) {
        this.profile_image = profile_image;
        this.name = name;
        this.favorite_genre = favorite_genre;
        this.favorite_movies = favorite_movies;
        this.favorite_comments = favorite_comments;
        this.favorite_reviews = favorite_reviews;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavorite_genre() {
        return favorite_genre;
    }

    public void setFavorite_genre(String favorite_genre) {
        this.favorite_genre = favorite_genre;
    }

    public String getFavorite_movies() {
        return favorite_movies;
    }

    public void setFavorite_movies(String favorite_movies) {
        this.favorite_movies = favorite_movies;
    }

    public String getFavorite_comments() {
        return favorite_comments;
    }

    public void setFavorite_comments(String favorite_comments) {
        this.favorite_comments = favorite_comments;
    }

    public String getFavorite_reviews() {
        return favorite_reviews;
    }

    public void setFavorite_reviews(String favorite_reviews) {
        this.favorite_reviews = favorite_reviews;
    }


    @Override
    public String toString() {
        return "User{" +
                "profile_image='" + profile_image + '\'' +
                ", name='" + name + '\'' +
                ", favorite_genre='" + favorite_genre + '\'' +
                ", favorite_movies='" + favorite_movies + '\'' +
                ", favorite_comments='" + favorite_comments + '\'' +
                ", favorite_reviews='" + favorite_reviews + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}


