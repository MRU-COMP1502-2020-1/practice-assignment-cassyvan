import java.util.ArrayList;

public class Box {
	
	private int height;
	private int weight;
	private int width;
	private int capacity;
	private ArrayList<Giftcard> listOfCards = new ArrayList<Giftcard>();
		
	public Box() {
		this.height = 0;
		this.weight = 0;
		this.width = 0;
	}
	
	public Box(int height, int weight, int width) {
		this.height = height;
		this.weight = weight;
		this.width = width;
	}
	
	public Box(int equalSides) {
		this.height = equalSides;
		this.weight = equalSides;
		this.width = equalSides;
	}
	
	public int getNumGiftcards() {
		return this.capacity;
	}
	
	public void setNumGiftcards(int capacity) {
		this.capacity = capacity;
	}
	
	public void addGiftcard(Giftcard giftcard) {
		while(listOfCards.size() < capacity) {
			listOfCards.add(giftcard);
			this.capacity--;
		}
	}
	
	public int showGiftCards() {
		return listOfCards.size();
	}
}
