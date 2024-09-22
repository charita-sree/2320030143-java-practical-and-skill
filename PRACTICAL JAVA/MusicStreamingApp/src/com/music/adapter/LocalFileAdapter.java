package com.music.adapter;

public class LocalFileAdapter implements MusicPlayer{
	private LocalFilePlayer localFilePlayer;
    private String filePath;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer, String filePath) {
        this.localFilePlayer = localFilePlayer;
        this.filePath = filePath;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile(filePath);
    }

}
