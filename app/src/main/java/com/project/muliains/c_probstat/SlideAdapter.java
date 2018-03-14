package com.project.muliains.c_probstat;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.project.muliains.c_probstat.Activity.MainActivity;

import java.util.ArrayList;

/**
 * Created by Muliains on 11-Dec-17.
 */

public class SlideAdapter extends PagerAdapter {
    private ArrayList<Integer> images;
    private LayoutInflater inflater;
    private Context context;

    public SlideAdapter( ArrayList<Integer> images, Context context) {
        this.images = images;
        this.inflater = LayoutInflater.from(context);;
        this.context = context;

    }

    @Override
        public int getCount() {
            return images.size();
        }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    private int[] sliderImagesId = new int[]{
                R.drawable.img1, R.drawable.img2, R.drawable.img3,
                R.drawable.img4
        };



        @Override
        public Object instantiateItem(ViewGroup container, int i) {
            View myImageLayout = inflater.inflate(R.layout.slide, container, false);
            ImageView myImage = myImageLayout
                    .findViewById(R.id.image);
            myImage.setImageResource(images.get(i));
            container.addView(myImageLayout, 0);
            return myImageLayout;
        }

        @Override
        public void destroyItem(ViewGroup container, int i, Object obj) {
            container.removeView((View) obj);
        }



}
