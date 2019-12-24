package dev.codenmore.beginner;

public class Launcher {
	public static void main(String[] args) {
		//new Game("title game!", 600, 400);
		//new Display("title", 1000, 1000);
		Game game = new Game("Title Game!", 640, 360);
		game.start();
	}

}
