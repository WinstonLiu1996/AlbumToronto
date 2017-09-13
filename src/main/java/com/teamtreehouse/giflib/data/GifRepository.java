package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jianjunliu on 2017-09-10.
 */

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("CityHall", 1, LocalDate.of(2015, 12, 21), "Winston Liu", false),
            new Gif("Coco", 3, LocalDate.of(2017, 2, 16), "Sheng Di", false),
            new Gif("HunanFriedFish", 3, LocalDate.of(2017, 9, 7), "Leo Li", false),
            new Gif("Island", 1, LocalDate.of(2017, 9, 7), "Winston Liu", true),
            new Gif("PowerUpGameBar", 4, LocalDate.of(2017, 9, 7), "Chris Ko", false),
            new Gif("UT", 2, LocalDate.of(2017, 9, 3), "Winston Liu", true),
            new Gif("UWaterloo", 2, LocalDate.of(2017, 9, 9), "Winston Liu", false)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    //Todo notice: new feature: get all gifs with designated categoryId
    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<Gif>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

}
