package com.example.yuejz.b;

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String path){
        mAssetPath = path;
        String[] components = path.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav","");
    }

    public String getmAssetPath(){
        return mAssetPath;
    }

    public String getName(){
        return mName;
    }
}
