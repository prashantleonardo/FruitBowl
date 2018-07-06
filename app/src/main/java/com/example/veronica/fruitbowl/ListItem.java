package com.example.veronica.fruitbowl;

public class ListItem {

    private String head;
    private String det;
    private String imageUrl;

    public ListItem(String head,String det,String imageUrl) {
        this.head = head;
        this.det=det;
    }

    public String getHead() {
        return head;
    }

    public String getDet() {
        return det;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}



