package com.example.edsnowden.guidemanasikumrah;

/**
 * Created by edSnowden on 10/15/2017.
 */

public class Word {
    private String mTitle;

    private String mSubtitle;

    private int mAudioId;



    public Word(String title, String subtitle, int audioId){
        mTitle = title;
        mSubtitle = subtitle;
        mAudioId = audioId;
    }

    public String getmTitle(){

        return mTitle;
    }

    public String getmSubtitle(){

        return mSubtitle;
    }

    public int getmAudioId(){

        return mAudioId;
    }
}
