package com.muntian;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    //    public MusicPlayer (Music music){
//        this.music = music
//    }
    public void setMusic(Music music) {
        this.music = music;
    }

        public void playMusic(){
        System.out.println("Current track is: "+ music.getSong());
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
