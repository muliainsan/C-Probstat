package com.project.muliains.c_probstat.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.project.muliains.c_probstat.R;

import java.io.File;

/**
 * Created by Muliains on 08-Dec-17.
 */

public class MateriFragment extends android.support.v4.app.Fragment{
        VideoView videoView;
    private VideoView myvideo;
    private MediaController mediacontroller;
        public MateriFragment() {

        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_materi, container, false);
            // Inflate the layout for this fragment
            videoView =  view.findViewById(R.id.vv1);
            //inisialisasi object videoView
//            videoView.setVideoPath("https://drive.google.com/open?id=1aslSSh05zN506s4uxcgNUkDD8Sj_Nkv-");

//            videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
//                    + R.raw.vidio_probstat));
//            videoView.setMediaController(new MediaController(getActivity().getApplicationContext()));
//            videoView.requestFocus();
//            videoView.setKeepScreenOn(true);
//            videoView.start();

            //akan membaca file samplevideo.3gp yang ada pada SDCARD (external memrory)
//            File clip=new File(Environment.getExternalStorageDirectory(),"vidio_probstat.4gp");


//            //Jika file samplevideo.3gp  ditemukan maka video dapat dimainkan
//            if (clip.exists()) {
//                myvideo = (VideoView) view.findViewById(R.id.vv1);
//                myvideo.setVideoPath(clip.getAbsolutePath());
//                mediacontroller = new MediaController(getActivity().getApplicationContext());
//                mediacontroller.setMediaPlayer(myvideo);
//                myvideo.setMediaController(mediacontroller);
//                myvideo.requestFocus();
//                myvideo.start();
//
//            }

            return view;
        }


}
