package com.music.adapter;

public class MusicStreamingApp {

	public static void main(String[] args) {
		 MusicPlayer localFilePlayer = new LocalFileAdapter(new LocalFilePlayer(), "song.mp3");
	        MusicPlayer equalizedLocalFilePlayer = new EqualizerDecorator(localFilePlayer);
	        MusicPlayer volumeControlledLocalFilePlayer = new VolumeControlDecorator(equalizedLocalFilePlayer);
	        volumeControlledLocalFilePlayer.play();

	        MusicPlayer onlineStreamingPlayer = new OnlineStreamingAdapter(new OnlineStreamingPlayer(), "http://example.com/stream");
	        MusicPlayer equalizedOnlineStreamingPlayer = new EqualizerDecorator(onlineStreamingPlayer);
	        equalizedOnlineStreamingPlayer.play();

	       
	        MusicPlayer radioPlayer = new RadioAdapter(new RadioPlayer(), "Classic Rock Station");
	        MusicPlayer volumeControlledRadioPlayer = new VolumeControlDecorator(radioPlayer);
	        volumeControlledRadioPlayer.play();
	    }

	}


