package com.kh.array.practice2.model;

public class MeberController {
	/*Free >_*/
	private Member[] member2 = new Member[3];
	public int count = 0;

	// 맴버 추가
	public void insertMember(Member m) {
		member2[count++] = new Member(m.getId(),m.getName(),m.getPwd(),
								m.getEmail(),m.getGender(),m.getAge());
	//System.out.println(Arrays.toString(member2));
	}
	// 맴버 아이디 검색 -> 맴버 index를 아이디 조회
	public int checkid(String id) {
		for(int i = 0; i < member2.length; i++) {
			if(member2[i] != null && member2[i].getId().equals(id)) {
				// 기존 맴버 배열에 아이디가 있는 경우!
				return i;
			}
		}
		// 아이디가 없는 경우
		return -1;
	}
	
	public void updateMember(String id, String name, String email, String pwd) {
		// 맴버의 index 찾기!
		int index = checkid(id);
		member2[index].setName(name);
		member2[index].setEmail(email);
		member2[index].setPwd(pwd);
	}
	
	// 맴버 조회
	public Member[] printAll() {
		return member2;
	}
}
