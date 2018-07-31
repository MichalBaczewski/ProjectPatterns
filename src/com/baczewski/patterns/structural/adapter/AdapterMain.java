package com.baczewski.patterns.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Book book = new FantasyBook();
        Album album = new HipHopAlbum();
        ResourceProduct resource = new AlbumResource(album);
        ViewProduct viewProduct = new ViewProduct(resource);
        viewProduct.show();
    }

}
