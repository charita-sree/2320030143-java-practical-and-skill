package com.music.adapter;

public class VolumeControlDecorator  extends MusicPlayerDecorator {
	public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume.");
    }

}