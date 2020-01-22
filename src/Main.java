
public class Main {
	public static void main(String[] args) {
		
		Giftcard starbucks = new Giftcard("me", "you", "hello");
		Giftcard timmies = new Giftcard("Bob", "Dave", "Hi");
		
		starbucks.getMsg();
		
		Box box = new Box(5);
		box.setNumGiftcards(3);
		
		box.addGiftcard(starbucks);
		box.addGiftcard(timmies);
		
		box.showGiftCards();
	}
}
