package com.baczewski.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class HipHopAlbum implements Album {

    @Override
    public List<String> listOfSongs() {
        return Arrays.asList(
                "piosenka pierwsza",
                "druga piosenka"
        );
    }

    @Override
    public String front() {
        return "Zdjęcie leroya";
    }

}
