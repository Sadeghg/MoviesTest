package models;

public class Movies {

    private String movie_cover;
    private String movie_publisher;
    private String movie_name;
    private String movie_genre;
    private String movie_rates;
    private String movie_comments;
    private String movie_reviews;
    private String movie_description;
    private String movie_year;
    private String movie_likes;

    public Movies(String movie_cover, String movie_name, String movie_genre, String movie_rates, String movie_comments, String movie_reviews, String movie_likes, String movie_year, String movie_publisher) {
        this.movie_cover = movie_cover;
        this.movie_name = movie_name;
        this.movie_genre = movie_genre;
        this.movie_rates = movie_rates;
        this.movie_comments = movie_comments;
        this.movie_reviews = movie_reviews;
        this.movie_likes = movie_likes;
        this.movie_publisher = movie_publisher;
        this.movie_year = movie_year;

    }

    public Movies() {
    }

    public String getMovie_publisher() {
        return movie_publisher;
    }

    public void setMovie_publisher(String movie_publisher) {
        this.movie_publisher = movie_publisher;
    }

    public String getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(String movie_year) {
        this.movie_year = movie_year;
    }

    public String getMovie_likes() {
        return movie_likes;
    }

    public void setMovie_likes(String movie_likes) {
        this.movie_likes = movie_likes;
    }

    public String getMovie_description() {
        return movie_description;
    }

    public void setMovie_description(String movie_description) {
        this.movie_description = movie_description;
    }

    public String getMovie_cover() {
        return movie_cover;
    }

    public void setMovie_cover(String movie_cover) {
        this.movie_cover = movie_cover;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_genre() {
        return movie_genre;
    }

    public void setMovie_genre(String movie_genre) {
        this.movie_genre = movie_genre;
    }

    public String getMovie_rates() {
        return movie_rates;
    }

    public void setMovie_rates(String movie_rates) {
        this.movie_rates = movie_rates;
    }

    public String getMovie_comments() {
        return movie_comments;
    }

    public void setMovie_comments(String movie_comments) {
        this.movie_comments = movie_comments;
    }

    public String getMovie_reviews() {
        return movie_reviews;
    }

    public void setMovie_reviews(String movie_reviews) {
        this.movie_reviews = movie_reviews;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movie_cover='" + movie_cover + '\'' +
                ", movie_publisher='" + movie_publisher + '\'' +
                ", movie_name='" + movie_name + '\'' +
                ", movie_genre='" + movie_genre + '\'' +
                ", movie_year='" + movie_year + '\'' +
                ", movie_rates='" + movie_rates + '\'' +
                ", movie_likes='" + movie_likes + '\'' +
                ", movie_comments='" + movie_comments + '\'' +
                ", movie_reviews='" + movie_reviews + '\'' +
                ", movie_description='" + movie_description + '\'' +
                '}';
    }
}
