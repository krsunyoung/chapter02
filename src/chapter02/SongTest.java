package chapter02;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
//		//객체 생성
		
		song.setAlbum("Real");
		song.setYear(2010);
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		// 값 입력
		song.show();
		
		Song song2 = new Song("Real", "아이유", "이민수", "좋은날",3,2010);
		
		song2.show();
		
		Song song3 = new Song("임창정", "내가저지른 사랑");
		song3.show();
		
		Song song4 = new Song("유재석&EXO", "Dancing King");
		song4.show();
		
	}

}
