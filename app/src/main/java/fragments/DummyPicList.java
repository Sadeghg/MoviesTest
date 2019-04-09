package fragments;

import models.DummyPics;
import models.Movies;

class DummyPicList {

    DummyPics[] PICS = {
            UsualSuspects,
            TheGame,
            MaryPoppins,
    };

    private static final DummyPics UsualSuspects = new DummyPics
            ("https://lumiere-a.akamaihd.net/v1/images/marypoppinsreturns_mobile_wallpaper09_eb70678c.jpeg");

    private static final DummyPics TheGame = new DummyPics
            ("https://lumiere-a.akamaihd.net/v1/images/marypoppinsreturns_mobile_wallpaper09_eb70678c.jpeg");

    private static final DummyPics MaryPoppins = new DummyPics
            ("https://images.wallpaperscraft.com/image/star_wars_darth_vader_anakin_skywalker_99807_1280x720.jpg");

}