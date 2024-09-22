package com.music.adapter;

public class RadioAdapter implements MusicPlayer{
	private RadioPlayer radioPlayer;
    private String station;

    public RadioAdapter(RadioPlayer radioPlayer, String station) {
        this.radioPlayer = radioPlayer;
        this.station = station;
    }

    @Override
    public void play() {
        radioPlayer.tuneToStation(station);
    }

}
