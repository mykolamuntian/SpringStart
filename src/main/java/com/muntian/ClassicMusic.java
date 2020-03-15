package com.muntian;

import org.springframework.stereotype.Component;
@Component
public class ClassicMusic implements Music {

    private ClassicMusic (){}

    public static ClassicMusic getInstance(){
        return new ClassicMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungerian Rapsody";
    }
}
