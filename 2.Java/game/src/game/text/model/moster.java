package game.text.model;

public class moster {
	
	private String monstername;
	private int monsterhp;
	private int monsterattck;
	private int monstershild;
	private int monsterexp;
	private String explanation;
	
	
	public moster() {
	
	}


	public moster(String monstername, int monsterhp, int monsterattck, int monstershild, int monsterexp,
			String explanation) {
		this.monstername = monstername;
		this.monsterhp = monsterhp;
		this.monsterattck = monsterattck;
		this.monstershild = monstershild;
		this.monsterexp = monsterexp;
		this.explanation = explanation;
	}


	public String getMonstername() {
		return monstername;
	}


	public void setMonstername(String monstername) {
		this.monstername = monstername;
	}


	public int getMonsterhp() {
		return monsterhp;
	}


	public void setMonsterhp(int monsterhp) {
		this.monsterhp = monsterhp;
	}


	public int getMonsterattck() {
		return monsterattck;
	}


	public void setMonsterattck(int monsterattck) {
		this.monsterattck = monsterattck;
	}


	public int getMonstershild() {
		return monstershild;
	}


	public void setMonstershild(int monstershild) {
		this.monstershild = monstershild;
	}


	public int getMonsterexp() {
		return monsterexp;
	}


	public void setMonsterexp(int monsterexp) {
		this.monsterexp = monsterexp;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	@Override
	public String toString() {
		return "moster [monstername=" + monstername + ", monsterhp=" + monsterhp + ", monsterattck=" + monsterattck
				+ ", monstershild=" + monstershild + ", monsterexp=" + monsterexp + ", explanation=" + explanation
				+ "]";
	}
	
}
