package com.baczewski.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DocumentFlyweightFactory {

    private final DocumentParser parser;
    private final Map<String, Document> library = new HashMap<>();

    DocumentFlyweightFactory(DocumentParser parser) {
        this.parser = parser;
    }

    Document getDocument(String fileName, String content){
        Document document = library.get(content);
        if (document == null) {
            document = parser.parseDocument(fileName, content);
            library.put(content, document);
        }
        return document;
    }

}
