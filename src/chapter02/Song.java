package chapter02;

public class Song {

		private String title;
		private String artist;
		private String album;
		private String composer;
		private int year;
		private int track;
		
		public Song(){
			
		}
		public Song(String artist, String title){
//			this.artist=artist;
//			this.title=title;
//			System.out.println("새 노래가 추가되었습니다.");
			
			this( null, artist, null, title, 0,0);
			//아래에 있는 Song을 그대로 연결해 줄수 잇다. 위와 같이 하면
			//3줄짜리처럼 다 안써줘도 된다. 한번 쓰므로써 반복.
		}
		public Song(String album, String artist,String composer, String title, int track, int year)
		{
			this.album=album;
			this.artist=artist;
			this.composer=composer;
			this.title=title;
			this.year=year;
			this.track=track;
			System.out.println("새 노래가 추가되었습니다.");	
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getComposer() {
			return composer;
		}
		public void setComposer(String composer) {
			this.composer = composer;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getTrack() {
			return track;
		}
		public void setTrack(int track) {
			this.track = track;
		}
		public void show(){
			System.out.println(artist  +" "+ title + "("+album+", "+year+", "+track  
					+"번 track, " +composer +"작곡)");	
		}
}
