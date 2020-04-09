package com.laalela_api.api_tests;

import org.apache.log4j.xml.DOMConfigurator;

import com.laalela_api.utility.Log;

public class Tests {
	public static void main(String args[]) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		TestCases test=new TestCases();
		
		System.out.println("Songs API Test");
		Log.Info("Songs API Test");
		test.songsschemacheck("http://159.65.149.30/laalela/api/v1/songs");
		
		System.out.println("Album API Test");
		Log.Info("Album API Test");
		test.albumschemacheck("http://159.65.149.30/laalela/api/v1/albums");
		
		System.out.println("Artist API Test");
		Log.Info("Artist API Test");
		test.artistschemacheck("http://159.65.149.30/laalela/api/v1/artists");
		
		System.out.println("Genre API Test");
		Log.Info("Genre API Test");
		test.genreschemacheck("http://159.65.149.30/laalela/api/v1/genres");
		
		System.out.println("Playlist API Test");
		Log.Info("Playlist API Test");
		test.playlistschemacheck("http://159.65.149.30/laalela/api/v1/playlists");
		
		System.out.println("Home API Test");
		Log.Info("Home API Test");
		test.homeschemacheck("http://159.65.149.30/laalela/api/v1/home");
		
		System.out.println("phone Register API Test");
		Log.Info("Phone Register API Test");
		test.phoneregistercheck("http://159.65.149.30/laalela/api/v1/users/register/phone");
		
		System.out.println("phone Login API Test");
		Log.Info("Phone Login API Test");
		test.phonelogincheck("http://159.65.149.30/laalela/api/v1/users/login/phone");
		
		System.out.println("Facebook Login API Test");
		Log.Info("Facebook Login API Test");
		test.facebooklogincheck("http://159.65.149.30/laalela/api/v1/users/login/facebook");
		
		System.out.println("Guest Login API Test");
		Log.Info("Guest Login API Test");
		test.guestlogincheck("http://159.65.149.30/laalela/api/v1/users/login/guest");
	
		System.out.println("Song Played by SongID");
		Log.Info("Song Played by SongID");
		test.songplayedbysongid("http://159.65.149.30/laalela/api/v1/songs/225/played");
		
		System.out.println("Song Played by AlbumID");
		Log.Info("Song Played by AlbumID");
		test.songplayedbyalbumid("http://159.65.149.30/laalela/api/v1/albums/14/songs");
	}
}
