package com.example.recyclerview;

public class Item {
    private int imageId;
    private String heading;
    private String notice;

    public Item(int imageId, String heading, String notice) {
        this.imageId = imageId;
        this.heading = heading;
        this.notice = notice;
    }

    public String getHeading() {
        return heading;
    }

    public String getNotice() {
        return notice;
    }

    public int getImage() {
        return imageId;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public void setImage(int imageId) {
        this.imageId = imageId;
    }
}
