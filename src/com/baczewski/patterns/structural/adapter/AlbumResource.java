package com.baczewski.patterns.structural.adapter;

import java.util.stream.Collectors;

public class AlbumResource implements ResourceProduct{

    private final Album album;

    AlbumResource(Album album) {
        this.album = album;
    }

    @Override
    public String getPicture() {
        return album.front();
    }

    @Override
    public String getContent() {
        return album.listOfSongs().stream()
                .collect(
                        Collectors.joining("\n")
                );
    }

}
