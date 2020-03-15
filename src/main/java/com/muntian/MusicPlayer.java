package com.muntian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private Music music;



    private String name;
    private int volume;

    private List<Music> musicList = new ArrayList<>();

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public void setMusic(Music music){
//        this.music = music;
//        System.out.println("setter");
//    }

    public void playMusic() {
        System.out.println("Current track is: " + music.getSong());
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Current track is: " + music.getSong());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
