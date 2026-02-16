package com.example.designpatterns.yapisalKaliplar.facade.ornek1;


import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.DVDPlayer;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.Projector;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.SoundSystem;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.TV;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Projector projector;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem, Projector projector) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

    //ev sinema sistemini başlat:
    public void watchMovie(String movie) {
        System.out.println("Ev sineması başlatılıyor.");
        projector.turnOn();
        projector.setResolution("1080p");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(16);
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);

    }
    //ev sinemasını kapatma:
    public void endMovie() {
        System.out.println("ev sinema sistemi kapatılıyor");
        projector.turnOff();
        dvdPlayer.turnOff();
        tv.turnOff();
        soundSystem.turnOff();
    }

}
