package game.text.model;

public class mypage {

	private String name;
	private String rank;
	private int level;
	private int shortsexp;
	private int longexp;
	private int hp;
	private int attck;
	private int shild;
	private int healingpotion;
	private int gold;
	
	public mypage() {
		
	}
	
	public mypage(String name, String rank, int level, int shortsexp, int longexp, int hp, int attck, int shild,
			int healingpotion, int gold) {
		this.name = name;
		this.rank = rank;
		this.level = level;
		this.shortsexp = shortsexp;
		this.longexp = longexp;
		this.hp = hp;
		this.attck = attck;
		this.shild = shild;
		this.healingpotion = healingpotion;
		this.gold = gold;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getShortsexp() {
		return shortsexp;
	}
	public void setShortsexp(int shortsexp) {
		this.shortsexp = shortsexp;
	}
	public int getLongexp() {
		return longexp;
	}
	public void setLongexp(int longexp) {
		this.longexp = longexp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttck() {
		return attck;
	}
	public void setAttck(int attck) {
		this.attck = attck;
	}
	public int getShild() {
		return shild;
	}
	public void setShild(int shild) {
		this.shild = shild;
	}
	public int getHealingpotion() {
		return healingpotion;
	}
	public void setHealingpotion(int healingpotion) {
		this.healingpotion = healingpotion;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
	@Override
	public String toString() {
		return "이름 : " + name +"\n"+
				"직업 : " +rank +"\n"+
				"레벨 : " + level +"\n"+
				"경험치 : " + shortsexp +"/"+ longexp +"\n"+
				"체력 : " + hp +"\n"+
				"공격력 : " + attck +"\n"+
				"방어력 : " + shild +"\n"+
				"물약 : " + healingpotion +"\n"+
				"골드 : " + gold +"\n";
	}
	
}
