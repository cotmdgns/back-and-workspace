package com.kh.practice2;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice2.model.Music;
import com.kh.practice2.model.controller.MusicController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public static void main(String[] args) {
		//쌤이 한거
		Application app = new Application();
		app.menu();
	}
	public void menu() {
		try {
			boolean check = true;
			while(check) {
				System.out.println("======= 메인메뉴 ======");
				System.out.println("1. 마지막위치에 곡 추가");
				System.out.println("2. 첫위치에 곡 추가");
				System.out.println("3. 전체 곡 목록 출력");
				System.out.println("4. 특정 곡 검색");
				System.out.println("5. 특정 곡 삭제");
				System.out.println("6. 특정 곡 수정");
				System.out.println("7. 가수명 내림차순 정렬");
				System.out.println("8. 곡명 오름차운 정렬");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 입력 :");
				switch(Integer.parseInt(sc.nextLine())) {
					case 1:
						addLastList();
						break;
					case 2:
						addFirstList();
						break;
					case 3:
						printfAll();
						break;
					case 4:
						searchMusic();
						break;
					case 5:
						removeMusic();
						break;
					case 6:
						UpdateMusic();
						break;
					case 7:
						descArtist();
						break;
					case 8:
						ascSong();
						break;
					case 9:
						System.out.println("종료");
						check = false;
						break;
					default:
						System.out.println("숫자를 입력해주세요. 다시 입력해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			menu();
		}
		
	}
	public void addLastList() { // 마지막 위치에 추가한다
		System.out.println("***** 마지막위치에곡추가 *****");
		System.out.print("곡명 : ");
		String song = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		boolean result = mc.addLastList(new Music(artist, song));
		if(result) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	public void addFirstList() { // 첫 위치에 추가한다.
		System.out.println("***** 첫 위치에 곡 추가 *****");
		System.out.print("곡명 : ");
		String song = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		boolean result = mc.addFirstList(new Music(artist, song));
		if(result) System.out.println("추가 성공");
		else System.out.println("추가 실패");
		
	}
	public void printfAll() { // 전체 곡 목록 출력
		System.out.println("***** 전체곡목록출력 *****");
		ArrayList<Music> list = mc.printfAll();
		for(Music music : list) {
			System.out.println(music);
		}
	}
	public void searchMusic() { // 특정 곡 검색
		System.out.println("****** 특정곡검색 ******");
		System.out.print("검색할 곡명 : ");
		String song = sc.nextLine();
		Music music = mc.searchMusic(song);
		if(music!=null) {
			System.out.println(music + " 을 검색했습니다.");
		}else {
			System.out.println("검색할 곡을 찾지 못했습니다.");
		}
		
	}
	public void removeMusic() { // 특정 곡 삭제
		System.out.println("****** 특정곡삭제 ******");
		System.out.print("삭제할 곡명 : ");
		String song = sc.nextLine();
		Music music = mc.removeMusic(song);
		if(music!=null)	{
			System.out.println(music+" 을 삭제함");	
		}else {
			System.out.println("삭제할 곡이 없습니다");
		}
		// song 조건에 따라서 : 정확하게 곡 입력해야 함!
		
		
	}
	public void UpdateMusic() { // 특정 곡 수정
		System.out.println("****** 특정곡수정 ******");
		System.out.print("검색할 곡명 : ");
		String search = sc.nextLine();
		System.out.print("수정할 곡명 : ");
		String song = sc.nextLine();
		System.out.print("수정할 가수명 : ");
		String artist = sc.nextLine();
		Music music = mc.UpdateMusic(search, new Music(artist,song));
		if(music!=null) {
			System.out.println(music);
		}else {
			System.out.println("수정할 곡을 찾지못함");
		}
		// search에 따라 정확하게 입력했을 경우만 수정되게끔!
	}
	public void descArtist() { // 가수명 내림차순 정렬
		System.out.println("***** 가수명내림차순정렬 *****");
		for(Music music : mc.descArtist()) {
			System.out.println(music);
		}
	}
	public void ascSong() { // 가수명 오름차순 정렬
		System.out.println("****** 곡명오름차순정렬 ******");
		for(Music music : mc.ascSong()) {
			System.out.println(music);
		}
	}
}
