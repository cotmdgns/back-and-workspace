package game.text.model;

public class shop {
	
	private int shopHealingpostion;
	private int shopSlied;
	private int shopAttck;
	
	public shop() {
		
	}

	public shop(int shopHealingpostion, int shopSlied, int shopAttck) {
		this.shopHealingpostion = shopHealingpostion;
		this.shopSlied = shopSlied;
		this.shopAttck = shopAttck;
	}

	public int getShopHealingpostion() {
		return shopHealingpostion;
	}

	public void setShopHealingpostion(int shopHealingpostion) {
		this.shopHealingpostion = shopHealingpostion;
	}

	public int getShopSlied() {
		return shopSlied;
	}

	public void setShopSlied(int shopSlied) {
		this.shopSlied = shopSlied;
	}

	public int getShopAttck() {
		return shopAttck;
	}

	public void setShopAttck(int shopAttck) {
		this.shopAttck = shopAttck;
	}

	@Override
	public String toString() {
		return "shop [shopHealingpostion=" + shopHealingpostion + ", shopSlied=" + shopSlied + ", shopAttck="
				+ shopAttck + "]";
	}
	
}
