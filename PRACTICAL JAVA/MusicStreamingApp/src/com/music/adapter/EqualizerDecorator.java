package com.music.adapter;

public class EqualizerDecorator  extends MusicPlayerDecorator{
	public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Adding equalizer effects.");
    }

}
