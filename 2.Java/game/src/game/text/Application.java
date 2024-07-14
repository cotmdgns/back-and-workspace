package game.text;

import java.util.Scanner;

import game.text.controller.ApplicationController;
import game.text.model.moster;
import game.text.model.mypage;

public class Application {

	Scanner sc = new Scanner(System.in);
	private mypage my1 = new mypage();
	private ApplicationController AC = new ApplicationController();
	
	public static void main(String[] args) {
		
		Application A = new Application();
		A.gamemeun();
		
		
	}
	public void gamemeun() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
//		my1.setName(sc.nextLine());
		
		boolean run1 = true;
		while(run1) {
			System.out.println("1. 게임 정보");
			System.out.println("2. 게임 시작");
			System.out.println("3. 게임 종료");
			System.out.print("번호를 눌러주세요 : ");
			try {
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
				case 1:
					gameExplanation();
					break;
				case 2:
					gamestart();
					break;
				case 3:
					System.out.println("게임을 종료합니다. ");
					run1 = false;
					break;
				default:
					System.out.println("입력 번호가 틀립니다.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력 해주세요");
			}
			
		}
	}
	public void gameExplanation(){
		System.out.println("1.체력이 0이 되면 게임 오버");
		System.out.println("2.일정확률로 크리티컬 발생!! (두배 데미지) (1/3 확률)");
		System.out.println("3.일정확률로 상대 공격을 회피 할 수 있다! (1/3 확률)");
		System.out.println("4.방어력은 그 수치만큼 적의 공격을 감소시킨다!");
		System.out.println("5.마지막 보스를 잡으면 클리어!");
	}
	
	public void gamestart() {
		boolean run2 = true;
		while(run2) {
			System.out.println("1. 내정보");
			System.out.println("2. 몬스터 정보");
			System.out.println("3. 상점");
			System.out.println("4. 던전입장");
			System.out.println("5. 메인메뉴로");
			System.out.print("번호를 눌러주세요 : ");
			try {
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
				case 1:
					my();
					break;
				case 2:
					moster();
					break;
				case 3:
					shop();
					break;
				case 4:
					dungeon();		
					break;
				case 5:
					gamemeun();
					System.out.println("메인메뉴로 돌아갑니다.");
					run2 = false;
					break;
				default:
					System.out.println("입력 번호가 틀립니다.");
				}
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
			
		}
	}
	public void my() {
		String rank = "전사";
		int level = 1;
		int shortexp = 0;
		int longexp = 50;
		int hp = 150;
		int attck = 20;
		int slied = 5;
		int healingpotion = 0;
		int gold = 1000;
//		mypage my = new mypage(my1.getName(), rank, level, shortexp, longexp, hp, attck, slied, healingpotion, gold);
//		AC.mypage(my);
	}
	public void moster() {
		moster[] mo = {
				new moster("슬라임",60,5,0,5,"귀엽다"),
				new moster("칼든 고블린",100,15,0,20,"공격력은 강하지만 방어력은 약하다!"),
				new moster("겁쟁이 고블린",30,5,-5,10,"다른 고블린에 비해 약하다!"),
				new moster("방패 고블린",70,5,15,20,"벙어력은 높지만 공격력은 약하다!"),
				};
		for(int i=0;i<mo.length;i++	) {
//			AC.monster(mo[i]);
			System.out.println(mo[i]);
		}
	}
	public void monsterBoss() {
		moster mo = new moster("골렘",400,40,30,100,"느리지만 강력한 공력력!");
	}
	
	public void shop() {
		System.out.println("귀한 상점에 누추하신분이 오신걸 환영합니다. ");
		System.out.println("(￣ω￣)/");
		System.out.println("1. 회복물약 200원 (재고 :2개)");
		System.out.println("2. 롱소드 600원 (공격력 +5)");
		System.out.println("3. 방패 600원 (방어력 +5)");
		System.out.println("4. 나가기");
		System.out.print("번호를 눌러주세요 : ");
		try {
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				System.out.println("구매해줘서 고맙네~");
				System.out.println("흠.. 돈이 부족한데");
				break;
			case 2:
				System.out.println("구매해줘서 고맙네~");
				System.out.println("흠.. 돈이 부족한데");
				break;
			case 3:
				System.out.println("구매해줘서 고맙네~");
				System.out.println("흠.. 돈이 부족한데");
				break;
			case 4:
				System.out.println("잘 가시게나~");
				break;
			default:
				System.out.println("번호를 입력해주세요");
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
		}
		
	}

	public void dungeon() {
		System.out.println("여기는 콘솔에 저정한 값들을 출력");
		System.out.println("보스까지 : 0 / 50"); //콘솔에 int값을 넣어서 50이 되거나 넘으면 보스 출현
		System.out.println("1. 앞으로 전진"); // 1~6랜덤으로 움직임
		System.out.println("2. 물약 먹기");
		System.out.print("번호를 입력해주세요 : ");
		try {
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				eventMonster();
				break;
			case 2:
				System.out.println("Hp가 회복되었습니다!");
				// 콘솔에서 mypage에서 확인후 존재하면 -- 하나빼고 hp에 50 더하기(넘어갈시 최대 hp)
				break;
			default:
				System.out.println("번호를 입력해주세요");
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
		}
	}
	
	public void eventMonster() {
		System.out.println("주사위가 굴려집니다 .");
		int Advance = (int) (Math.random()*6)+1;
		// 바로 밑에다가 콘솔로 보내는 값을 넣기
		if(Advance == 50) {// Advance 위체에 콘솔에 보낸 값을 들어와야함
			System.out.println("드디어 만났다 골렘!");
			battlepageBoss();
		}else {
			int event = (int) (Math.random()*3)+1;
			switch(event) {
			case 1:
				System.out.println("야생의 몬스터를 발견했다!");
				battlepage();
				break;
			case 2:
				System.out.println("날씨가 화창하다.");
				break;
			case 3:
				System.out.println("힘들지만 괜찮아");
				break;
			}
		}
	}
	public void battlepage() {
		// 콘솔에 저장된 monster 를
		// 랜덤값을 돌려 4개중 하나를 소환하게끔 만들기
		// mypage에 저장된 내 데이터를 가져오기
		System.out.println("여기는 내 데이터!");
		System.out.println(); // 한칸 띄우기
		System.out.println("여기는 몬스터 데이터!");
		System.out.println();
		System.out.println("1. 공격");
		System.out.println("2. 방어");
		System.out.println("1. 물약먹기");
		System.out.print("입력해주세요");
		try {
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				//콘솔에 공격정보란 만들고
				//리턴값에 String 만들어서 얼마나 줬는지 데이터값 주기 
				//적 hp가 0이 되면 다시 던전으로
				break;
			case 2:
				//콘솔에 방어정보란 만들고
				//리턴값에 String 만들어서 얼마나 맊았는지 데이터값 주기
				break;
			case 3:
				//이거는 dungeon 물약 먹는거랑 중복
				break;
			default:
				System.out.println("숫자를 입력해주세요");
			}
		} catch (Exception e) {
			System.out.println("제대로 입력해주세요");
		}
	}
	public void battlepageBoss() {
		// 콘솔에 저정된 보스를 호출하여 배틀
		// mypage에 저장된 내 데이터를 가져오기
		System.out.println("여기는 내 데이터!");
		System.out.println(); // 한칸 띄우기
		System.out.println("여기는 보스 데이터!");
		System.out.println();
		System.out.println("1. 공격");
		System.out.println("2. 방어");
		System.out.println("1. 물약먹기");
		System.out.print("입력해주세요");
		try {
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				//콘솔에 공격정보란 만들고
				//리턴값에 String 만들어서 얼마나 줬는지 데이터값 주기 
				//적 hp가 0이 되면 다시 던전으로
				break;
			case 2:
				//콘솔에 방어정보란 만들고
				//리턴값에 String 만들어서 얼마나 맊았는지 데이터값 주기
				break;
			case 3:
				//이거는 dungeon 물약 먹는거랑 중복
				break;
			default:
				System.out.println("숫자를 입력해주세요");
			}
		} catch (Exception e) {
			System.out.println("제대로 입력해주세요");
		}

		
	}
}

