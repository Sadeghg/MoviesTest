package fragments;

import android.net.Uri;

import com.example.moviestest.R;

import models.Movies;

public class DummyMoviesList {

    public Movies[] MOVIES = {
            UsualSuspects,
            TheGame,
            MaryPoppins,
            GhostProtocol,
            CastleVania,
            SongOfTheSea,
            TheSeceretOfTheKells
    };



    public static final Movies UsualSuspects = new Movies("https://images.pexels.com/photos/440731/pexels-photo-440731.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
            ,"Usual Suspects", "Thrill/Mystery", "89%", "comment", "good", "54", "1995"
            ,"https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr03/2013/3/11/11/enhanced-buzz-orig-6669-1363014984-24.jpg?downsize=800:*&output-format=auto&output-quality=auto"
    );

    public static final Movies TheGame = new Movies("https://images.wallpaperscraft.com/image/star_wars_the_force_awakens_main_characters_105940_1280x720.jpg",
            "The Game", "Thrill", "74%", "Great MoviesEverest", "Good", "22", "2002"
            ,"https://lumiere-a.akamaihd.net/v1/images/marypoppinsreturns_mobile_wallpaper09_eb70678c.jpeg"
    );

    public static final Movies MaryPoppins = new Movies("https://lumiere-a.akamaihd.net/v1/images/marypoppinsreturns_mobile_wallpaper09_eb70678c.jpeg",
            "Mary Poppins", "Thrill", "92%", "Great MoviesEverest", "Good", "24", "2007"
            ,"https://lumiere-a.akamaihd.net/v1/images/marypoppinsreturns_mobile_wallpaper09_eb70678c.jpeg"
    );

    public static final Movies GhostProtocol = new Movies("https://images.wallpaperscraft.com/image/teenage_mutant_ninja_turtles_raphael_michelangelo_leonardo_donatello_98466_1280x720.jpg",
            "Ghost Protocol", "Drama", "85%", "Great MoviesEverest", "Good", "91", "2019"
            ,"https://images.wallpaperscraft.com/image/star_wars_darth_vader_anakin_skywalker_99807_1280x720.jpg"
    );

    public static final Movies CastleVania = new Movies("https://images.wallpaperscraft.com/image/furious_7_fast_and_furious_7_dominic_toretto_brian_oconner_hobbs_deckard_shaw_letty_mia_roman_101511_1280x720.jpg",
            "CastleVania", "Family", "90%", "Great MoviesEverest", "Good", "200", "1935"
            ,"https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr03/2013/3/11/11/enhanced-buzz-orig-6669-1363014984-24.jpg?downsize=800:*&output-format=auto&output-quality=auto"
    );

    public static final Movies SongOfTheSea = new Movies("https://images.wallpaperscraft.com/image/rio_2_2014_cartoon_jewel_blu_linda_92989_1280x720.jpg",
            "Song Of The Sea", "Action", "94%", "Great MoviesEverest", "Good", "654", "2016"
            ,"https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr03/2013/3/11/11/enhanced-buzz-orig-6669-1363014984-24.jpg?downsize=800:*&output-format=auto&output-quality=auto"
    );

    public static final Movies TheSeceretOfTheKells = new Movies("https://images.wallpaperscraft.com/image/star_wars_darth_vader_anakin_skywalker_99807_1280x720.jpg",
            "The Secret Of The kells", "Thrill", "89%", "Great MoviesEverest", "Good","12", "1999"
            ,"https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr03/2013/3/11/11/enhanced-buzz-orig-6669-1363014984-24.jpg?downsize=800:*&output-format=auto&output-quality=auto"
    );
}


