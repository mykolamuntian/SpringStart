package com.muntian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicMusic classicMusic = context.getBean("musicBean1", ClassicMusic.class);
        ClassicMusic classicMusic1 = context.getBean("musicBean1", ClassicMusic.class);

        System.out.println(classicMusic + " & " + classicMusic1);
        //        classicMusic.getSong();
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println("comparison result " + comparison);
//        System.out.println("Music Player1: " + musicPlayer1);
//        System.out.println("Music Player2: " + musicPlayer2);
//        musicPlayer.playMusic();
//        musicPlayer1.playMusicList();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
