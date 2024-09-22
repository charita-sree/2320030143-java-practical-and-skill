package com.music.adapter;

public class MusicPlayerDecorator  implements MusicPlayer{
	protected MusicPlayer decoratedMusicPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
    }

}
