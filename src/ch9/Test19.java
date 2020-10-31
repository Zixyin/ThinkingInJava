package ch9;

public class Test19 {
	static void playGames(GameFactory gameFactory) {
		gameFactory.getGame().play();
	}
	public static void main(String[] args) {
		playGames(new CoinFactory());
		playGames(new DiceFactory());
	}
}
interface Game{
	void play();
}
interface GameFactory{
	Game getGame();
}
class Coin implements Game{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Coin");
	}
}
class CoinFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Coin();
	}
}
class Dice implements Game{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Dice");
	}
}
class DiceFactory implements GameFactory{
	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Dice();
	}
}