package ru.education.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private String country;
    private List<Music> musicList = new ArrayList();

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music song : musicList) {
            System.out.println("Играет песня: " + song.getSong());
        }
    }
}
