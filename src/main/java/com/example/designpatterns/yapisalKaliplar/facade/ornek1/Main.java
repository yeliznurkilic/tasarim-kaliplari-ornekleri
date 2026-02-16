package com.example.designpatterns.yapisalKaliplar.facade.ornek1;


import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.DVDPlayer;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.Projector;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.SoundSystem;
import com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler.TV;

public class Main {
    public static void main(String[] args) {

        //alt sistemleri oluştur
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();
        DVDPlayer dvdPlayer = new DVDPlayer();


        //ev sinema sistemini oluştur
        HomeTheaterFacade homeTheater= new HomeTheaterFacade(tv,dvdPlayer,soundSystem,projector);
        homeTheater.watchMovie("EZEL");
        System.out.println("\n----------------------------------------\n");
        homeTheater.endMovie();

    }
}
