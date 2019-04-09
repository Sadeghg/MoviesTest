package models;

public class DummyPics {

    private String movie_cover;

    public String getMovie_cover() {
        return movie_cover;
    }

    public DummyPics(String movie_cover) {
        this.movie_cover = movie_cover;

    }

    public DummyPics() {
    }

    public void setMovie_cover(String movie_cover) {
        this.movie_cover = movie_cover;
    }

    @Override
    public String toString() {
        return "DummyPics{" +
                "movie_cover='" + movie_cover + '\'' +
                '}';
    }
}
