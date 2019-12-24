package dev.codenmore.beginner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import images.gfx.ImagesLoader;

public class Game implements Runnable {
	
	private Display display;
	
	public int width, height;
	public String title;
	public boolean running = false;
	public Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		
		
	}
	
	private void init() {
		display = new Display(title, width, height);
		testImage = ImagesLoader.loadImage("C:/Users/ADMIN/eclipse-workspace/Beginner/final/start/vc.png");
	}
	
	// game loop
	
	//đánh dấu , update các biến, các thứ cần thiết trong game
	private void tick() {
		
	}
	
	// vẽ lại mọi thứ ra màn hình
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Trước khi draw thì phải Clear screen
		g.clearRect(0, 0, width, height);
		//D	raw here!!!
		 												//để fill màn hình đen : g.fillRect(2, 3, width, height);
															//g.setColor(Color.red); //fill cạnh của hcn là màu blue
															//g.fillRect(10, 50, 50, 70); //vẽ hình chữ nhật với kích thước như bên
		g.drawImage(testImage, 200, 200, null);
		
		
		
		//End drawing!!
		bs.show();
		g.dispose();
		
	}
	
	public void run() {
		init();
	
		while(running) {
			tick();
			render();
		}
		
		stop();
	}
	public synchronized void start() {
		//khởi đầu game
		if (running)
			return;
		running = true;
		
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop() {
		//kết thúc trò chơi
		if (!running) 
			return;
		running = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();	
		}
	}
}
