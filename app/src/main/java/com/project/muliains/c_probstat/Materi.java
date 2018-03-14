package com.project.muliains.c_probstat;

import android.widget.ImageView;

/**
 * Created by Muliains on 07-Dec-17.
 */

public class Materi {
     String Judul;
     String Desc;
     ImageView img;
     Calc Calkulator;

    public Materi(String judul, String desc, ImageView img, Calc calkulator) {
        Judul = judul;
        Desc = desc;
        this.img = img;
        Calkulator = calkulator;
    }

    public Materi(String judul, String desc) {
        Judul = judul;
        Desc = desc;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public Calc getCalkulator() {
        return Calkulator;
    }

    public void setCalkulator(Calc calkulator) {
        Calkulator = calkulator;
    }
}
