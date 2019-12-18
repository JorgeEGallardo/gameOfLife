package gameOfLaifu;

import javax.swing.JFrame;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		board b = new board();
		boolean s = true;
		b.Initgame();
		cells cells2 = new cells();
		cells2 = b.turn();
		JFrame wind = new JFrame();
		int[] lives = new int[100 * 100];
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				lives[(i * 100) + j] = cells2.cells[i][j].getState();
			}
		}
		rectangle rec = new rectangle(10, 10, 10, 10, lives);
		wind.add(rec);
		wind.setSize(1000, 1000);
		wind.setVisible(true);
		while (true) {
			cells2 = b.turn();
			lives = new int[100 * 100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					lives[(i * 100) + j] = cells2.cells[i][j].getState();
				}
			}
			rec = new rectangle(10, 10, 10, 10, lives);
			wind.add(rec);
			wind.add(rec);
			wind.setVisible(true);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
