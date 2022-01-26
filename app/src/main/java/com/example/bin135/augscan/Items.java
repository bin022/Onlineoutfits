package com.example.bin135.augscan;

public class Items {
    private String itemname;
    private String itembarcode;

    public Items(String itemname, String itembarcode) {
        this.itemname = itemname;
        this.itembarcode = itembarcode;
    }

    public Items() {

}

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItembarcode() {
        return itembarcode;
    }

    public void setItembarcode(String itembarcode) {
        this.itembarcode = itembarcode;
    }
}