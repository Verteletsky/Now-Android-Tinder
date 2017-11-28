package ru.now_android.nowandroidtinder.model;

/**
 * Created by Vendetta on 28.11.2017.
 */

public class Item {

    private int id;
    private String urlImg;

    public Item(int id, String urlImg) {
        this.id = id;
        this.urlImg = urlImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
