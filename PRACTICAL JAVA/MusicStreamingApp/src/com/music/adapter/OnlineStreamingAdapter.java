package com.music.adapter;

public class OnlineStreamingAdapter implements MusicPlayer {
	  private OnlineStreamingPlayer onlineStreamingPlayer;
	    private String url;

	    public OnlineStreamingAdapter(OnlineStreamingPlayer onlineStreamingPlayer, String url) {
	        this.onlineStreamingPlayer = onlineStreamingPlayer;
	        this.url = url;
	    }

	    @Override
	    public void play() {
	        onlineStreamingPlayer.streamOnline(url);
	    }
	
	

}
