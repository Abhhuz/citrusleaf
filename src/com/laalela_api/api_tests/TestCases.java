package com.laalela_api.api_tests;
import io.restassured.response.*;
import com.laalela_api.utility.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestCases {
	public void post(String url) {
		System.out.println("***********************POST_STARTS***************************");
		Log.Info("***********************POST_STARTS***************************");
	    Response rep=RestAssured.post(url);
	    int code=rep.getStatusCode();
	    System.out.println("Code "+code);
		Log.Info("Code "+code);
		System.out.println("Time "+rep.getTime());
		Log.Info("Time "+rep.getTime());
	    System.out.println("Data "+rep.asString());
	    Log.Info("Data "+rep.asString());
	    System.out.println("***********************POST_ENDS*****************************");
	    Log.Info("***********************POST_ENDS*****************************");
    }
	public void get(String url) {
		System.out.println("***********************GET_STARTS***************************");
		Log.Info("***********************GET_STARTS***************************");
		Response rep=RestAssured.get(url);
		int code=rep.getStatusCode();
		System.out.println("Code "+code);
		Log.Info("Code "+code);
		System.out.println("Time "+rep.getTime());
		Log.Info("Time "+rep.getTime());
	    System.out.println("Data "+rep.asString());
	    Log.Info("Data "+rep.asString());
	    System.out.println("***********************GET_ENDS*****************************");
	    Log.Info("***********************GET_ENDS*****************************");
	}
	public void delete(String url) {
		System.out.println("***********************DELETE_STARTS***************************");
		Log.Info("***********************DELETE_STARTS***************************");
		Response rep=RestAssured.get(url);
		int code=rep.getStatusCode();
		System.out.println("Code "+code);
		Log.Info("Code "+code);
		System.out.println("Time "+rep.getTime());
		Log.Info("Time "+rep.getTime());
	    System.out.println("Data "+rep.asString());
	    Log.Info("Data "+rep.asString());
	    System.out.println("***********************DELETE_ENDS*****************************");
	    Log.Info("***********************DELETE_ENDS*****************************");
	}
	public void put(String url) {
		System.out.println("***********************PUT_STARTS***************************");
		Log.Info("***********************PUT_STARTS***************************");
		Response rep=RestAssured.get(url);
		int code=rep.getStatusCode();
		System.out.println("Code "+code);
		Log.Info("Code "+code);
		System.out.println("Time "+rep.getTime());
		Log.Info("Time "+rep.getTime());
	    System.out.println("Data "+rep.asString());
	    Log.Info("Data "+rep.asString());
	    System.out.println("***********************PUT_ENDS*****************************");
	    Log.Info("***********************PUT_ENDS*****************************");
	}
	public void songsschemacheck(String url) {
		System.out.println("***********************Songs_Check***************************");
		Log.Info("***********************Songs_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Duration :"+c.contains("durations_ms"));
		Log.Info("Duration :"+c.contains("durations_ms"));
		System.out.println("Album :"+c.contains("album"));
		Log.Info("Album :"+c.contains("album"));
		System.out.println("Popularity :"+c.contains("popularity"));
		Log.Info("Popularity :"+c.contains("popularity"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("File Path :"+c.contains("file_path"));
		Log.Info("File Path :"+c.contains("file_path"));
		System.out.println("Image :"+c.contains("image"));
		Log.Info("Image :"+c.contains("image"));
		System.out.println("Mix :"+c.contains("mix"));
		Log.Info("Mix :"+c.contains("mix"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("Album name :"+c.contains("album_name"));
		Log.Info("Album name :"+c.contains("album_name"));
		System.out.println("Album Image :"+c.contains("album_image"));
		Log.Info("Album Image :"+c.contains("album_image"));
		System.out.println("Artist :"+c.contains("artists"));
		Log.Info("Artist :"+c.contains("artists"));
		System.out.println("Genre :"+c.contains("genre"));
		Log.Info("Genre :"+c.contains("genre"));
		System.out.println("Genre ID :"+c.contains("genre_id"));
		Log.Info("Genre ID :"+c.contains("genre_id"));
		System.out.println("Song url :"+c.contains("song_url"));
		Log.Info("Song url :"+c.contains("song_url"));
		System.out.println("Image url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Songs_Check*****************************");
	    Log.Info("***********************Songs_Check*****************************");
	}
	public void artistschemacheck(String url) {
		System.out.println("***********************Artist_Check***************************");
		Log.Info("***********************Artist_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Image :"+c.contains("image"));
		Log.Info("Image :"+c.contains("image"));
		System.out.println("Popularity :"+c.contains("popularity"));
		Log.Info("Popularity :"+c.contains("popularity"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Genre :"+c.contains("genre"));
		Log.Info("Genre :"+c.contains("genre"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("Genre name :"+c.contains("genre_name"));
		Log.Info("Genre name :"+c.contains("genre_name"));
		System.out.println("Imagen url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Artist_Check*****************************");
	    Log.Info("***********************Artist_Check*****************************");
	}
	public void albumschemacheck(String url) {
		System.out.println("***********************Albums_Check***************************");
		Log.Info("***********************Albums_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Image :"+c.contains("image"));
		Log.Info("Image :"+c.contains("image"));
		System.out.println("Popularity :"+c.contains("popularity"));
		Log.Info("Popularity :"+c.contains("popularity"));
		System.out.println("Release date :"+c.contains("release_date"));
		Log.Info("Release date :"+c.contains("release_date"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("Imagen url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Albums_Check*****************************");
	    Log.Info("***********************Albums_Check*****************************");
	}
	public void genreschemacheck(String url) {
		System.out.println("***********************Genre_Check***************************");
		Log.Info("***********************Genre_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Genre_Check*****************************");
	    Log.Info("***********************Genre_Check*****************************");
	}
	public void playlistschemacheck(String url) {
		System.out.println("***********************Playlist_Check***************************");
		Log.Info("***********************Playlist_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Image :"+c.contains("image"));
		Log.Info("Image :"+c.contains("image"));
		System.out.println("Description :"+c.contains("description"));
		Log.Info("Description :"+c.contains("description"));
		System.out.println("Popularity :"+c.contains("popularity"));
		Log.Info("Popularity :"+c.contains("popularity"));
		System.out.println("Public :"+c.contains("public"));
		Log.Info("Public :"+c.contains("public"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("User Id :"+c.contains("user_id"));
		Log.Info("user Id :"+c.contains("user_id"));
		System.out.println("Can delete :"+c.contains("can_delete"));
		Log.Info("Can delete :"+c.contains("can_delete"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("Username :"+c.contains("user_name"));
		Log.Info("Username :"+c.contains("user_name"));
		System.out.println("Songs :"+c.contains("songs"));
		Log.Info("Songs :"+c.contains("songs"));
		System.out.println("Image url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Playlist_Check*****************************");
	    Log.Info("***********************Playlist_Check*****************************");
	}
	public void homeschemacheck(String url) {
		System.out.println("***********************Home_Page_Check***************************");
		Log.Info("***********************Home_Page_Check***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("Key :"+c.contains("key"));
		Log.Info("key :"+c.contains("key"));
		System.out.println("Title :"+c.contains("title"));
		Log.Info("title :"+c.contains("title"));
		System.out.println("Items :"+c.contains("items"));
		Log.Info("items :"+c.contains("items"));
		System.out.println("Type :"+c.contains("type"));
		Log.Info("Type :"+c.contains("type"));
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Title 1 :"+c.contains("title1"));
		Log.Info("Title 1 :"+c.contains("title1"));
		System.out.println("Title 2 :"+c.contains("title2"));
		Log.Info("Title 2 :"+c.contains("title2"));
		System.out.println("Song url :"+c.contains("song_url"));
		Log.Info("Song url :"+c.contains("song_url"));
		System.out.println("Image url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Home_Page_Check*****************************");
	    Log.Info("***********************Home_Page_Check*****************************");
	}
	public void phoneregistercheck(String url) {
		System.out.println("***********************Phone_register***************************");
		Log.Info("***********************Phone_register***************************");
		Response response =
			      RestAssured.given()
			      	.param("name","test paal")
			      	.param("mobile","+16574667331")
			      	.param("email","thassa@fb.com")
			      	.when()
			        .post(url)
			        .then()
			        .contentType(ContentType.JSON)
			        .extract()
			        .response();
		
		System.out.println("Status Code :"+response.getStatusCode());
		Log.Info("Status Code :"+response.getStatusCode());
		System.out.println("Content Type :"+response.getContentType());
		Log.Info("Content Type :"+response.getContentType());
		System.out.println("Data :"+response.asString());
		Log.Info("Data :"+response.asString());
		
		String c=response.asString();
		
		System.out.println("token :"+c.contains("token"));
		Log.Info("token :"+c.contains("token"));
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("email :"+c.contains("email"));
		Log.Info("email :"+c.contains("email"));
		System.out.println("email_verified_at :"+c.contains("email_verified_at"));
		Log.Info("email_verified_at :"+c.contains("email_verified_at"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("mobile :"+c.contains("mobile"));
		Log.Info("mobile :"+c.contains("mobile"));
		System.out.println("provider :"+c.contains("provider"));
		Log.Info("provider :"+c.contains("provider"));
		System.out.println("provider_id :"+c.contains("provider_id"));
		Log.Info("provider_id :"+c.contains("provider_id"));
		//System.out.println("data :"+c);
		//Log.Info("data :"+c);
		System.out.println("***********************Phone_register***************************");
		Log.Info("***********************Phone_register***************************");
	}
	public void phonelogincheck(String url) {
		System.out.println("***********************Phone_login***************************");
		Log.Info("***********************Phone_login***************************");
		Response response =
			      RestAssured.given()
			      	//.param("name","test pal")
			      	.param("mobile","+16574667338")
			      	//.param("email","thasa@fb.com")
			      	.when()
			        .post(url)
			        .then()
			        .contentType(ContentType.JSON)
			        .extract()
			        .response();
		
		System.out.println("Status Code :"+response.getStatusCode());
		Log.Info("Status Code :"+response.getStatusCode());
		System.out.println("Content Type :"+response.getContentType());
		Log.Info("Content Type :"+response.getContentType());
		System.out.println("Data :"+response.asString());
		Log.Info("Data :"+response.asString());
		
		String c=response.asString();

		System.out.println("token :"+c.contains("token"));
		Log.Info("token :"+c.contains("token"));
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("email :"+c.contains("email"));
		Log.Info("email :"+c.contains("email"));
		System.out.println("email_verified_at :"+c.contains("email_verified_at"));
		Log.Info("email_verified_at :"+c.contains("email_verified_at"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("mobile :"+c.contains("mobile"));
		Log.Info("mobile :"+c.contains("mobile"));
		System.out.println("provider :"+c.contains("provider"));
		Log.Info("provider :"+c.contains("provider"));
		System.out.println("provider_id :"+c.contains("provider_id"));
		Log.Info("provider_id :"+c.contains("provider_id"));
		//System.out.println("data :"+c);
		//Log.Info("data :"+c);
		System.out.println("***********************Phone_login***************************");
		Log.Info("***********************Phone_login***************************");
	}
	public void facebooklogincheck(String url) {
		System.out.println("***********************Facebook_login***************************");
		Log.Info("***********************Facebook_login***************************");
		Response response =
			      RestAssured.given()
			      	.param("name","test fb user")
			      	.param("mobile","+919611178784")
			      	.param("provider_id","abc5455")
			      	.param("email","tgg@fb.com")
			      	.when()
			        .post(url)
			        .then()
			        .contentType(ContentType.JSON)
			        .extract()
			        .response();
		
		System.out.println("Status Code :"+response.getStatusCode());
		Log.Info("Status Code :"+response.getStatusCode());
		System.out.println("Content Type :"+response.getContentType());
		Log.Info("Content Type :"+response.getContentType());
		System.out.println("Data :"+response.asString());
		Log.Info("Data :"+response.asString());
		
		String c=response.asString();
		
		System.out.println("token :"+c.contains("token"));
		Log.Info("token :"+c.contains("token"));
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("email :"+c.contains("email"));
		Log.Info("email :"+c.contains("email"));
		System.out.println("email_verified_at :"+c.contains("email_verified_at"));
		Log.Info("email_verified_at :"+c.contains("email_verified_at"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("mobile :"+c.contains("mobile"));
		Log.Info("mobile :"+c.contains("mobile"));
		System.out.println("provider :"+c.contains("provider"));
		Log.Info("provider :"+c.contains("provider"));
		System.out.println("provider_id :"+c.contains("provider_id"));
		Log.Info("provider_id :"+c.contains("provider_id"));
		//System.out.println("data :"+c);
		//Log.Info("data :"+c);
		System.out.println("***********************Facebook_login***************************");
		Log.Info("***********************Facebook_login***************************");
	}
	public void guestlogincheck(String url) {
		System.out.println("***********************Guest_login***************************");
		Log.Info("***********************Guest_login***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("token :"+c.contains("token"));
		Log.Info("token :"+c.contains("token"));
		System.out.println("data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Guest_login***************************");
		Log.Info("***********************Guest_login***************************");
	}
	public void songplayedbysongid(String url) {
		System.out.println("***********************Song_Played_By_SongID***************************");
		Log.Info("***********************Song_Played_By_SongID***************************");
		Response response =
			      RestAssured.given()
			          .headers(
			              "Authorization",
			              "Bearer eyJpdiI6IlVKWkVVcFNYZFQ0NytUNUZqRXk2NkE9PSIsInZhbHVlIjoib3c2R2JVSUxocHE1eDJOYnBNdkNGUzBldFkvcFFDYnBNazFSOURJSWt2VjhwdER3cEJjZTJXK2JQa2hYNXBRWCIsIm1hYyI6IjdkMDJiMzhlOWIyMDUzNmFhZmJiMTE1ZTYxOTY0ZmE2ZjAxMjJkOGI0ZDU2ODI3MGM5NmFmZGJlOWI3ODczOTIifQ")
			              
			          .when()
			          .post(url)
			          .then()
			          .contentType(ContentType.JSON)
			          .extract()
			          .response();
		
		System.out.println("Response Code :"+response.getStatusCode());
		Log.Info("Response Code :"+response.getStatusCode());
		System.out.println("Content Type :"+response.getContentType());
		Log.Info("Content Type :"+response.getContentType());
		System.out.println("Data :"+response.asString());
		Log.Info("Data :"+response.asString());
		
		
		//Log.Info("data :"+c);
		System.out.println("***********************Song_Played_By_SongID***************************");
		Log.Info("***********************Song_Played_By_SongID***************************");
	}
	public void songplayedbyalbumid(String url) { 
		System.out.println("***********************Song_Played_By_AlbumID***************************");
		Log.Info("***********************Song_Played_By_AlbumID***************************");
		Response rep=RestAssured.get(url);
		String a=rep.contentType();
		System.out.println("Content Type :"+a);
		Log.Info("Content Type :"+a);
		int b=rep.getStatusCode();
		System.out.println("Status Code :"+b);
		Log.Info("Status Code :"+b);
		String c=rep.asString();
		System.out.println("ID :"+c.contains("id"));
		Log.Info("ID :"+c.contains("id"));
		System.out.println("Name :"+c.contains("name"));
		Log.Info("Name :"+c.contains("name"));
		System.out.println("Image :"+c.contains("image"));
		Log.Info("Image :"+c.contains("image"));
		System.out.println("Popularity :"+c.contains("popularity"));
		Log.Info("Popularity :"+c.contains("popularity"));
		System.out.println("Release date :"+c.contains("release_date"));
		Log.Info("Release date :"+c.contains("release_date"));
		System.out.println("Created :"+c.contains("created_at"));
		Log.Info("Created :"+c.contains("created_at"));
		System.out.println("Updated :"+c.contains("updated_at"));
		Log.Info("Updated :"+c.contains("updated_at"));
		System.out.println("Deleted at :"+c.contains("deleted_at"));
		Log.Info("Deleted at :"+c.contains("deleted_at"));
		System.out.println("Imagen url :"+c.contains("image_url"));
		Log.Info("Image url :"+c.contains("image_url"));
		System.out.println("songs :"+c.contains("songs"));
		Log.Info("songs :"+c.contains("songs"));
		System.out.println("Data :"+c);
		Log.Info("data :"+c);
		System.out.println("***********************Song_Played_By_AlbumID***************************");
		Log.Info("***********************Song_Played_By_AlbumID***************************");
	}
}

