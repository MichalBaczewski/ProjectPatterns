package com.baczewski.patterns.structural.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Resource resource = new BookResource(
                "Mirage",
                "album_mirage.jpg",
                "piosenka pierwsza"
                ,"Armada"
        );
        View view = new ShortView(resource);
        view.show();
    }

}
