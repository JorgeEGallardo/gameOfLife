package gameOfLaifu;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class rectangle extends JPanel {
	int x;
	int y;
	int w;
	int h;
	int lives[];

	public rectangle(int xp, int yp, int wp, int hp, int[] livesp) {
		x = xp;
		y = yp;
		w = wp;
		h = hp;
		lives = livesp;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (lives[(i * 100) + j] == 1) {
					g.setColor(Color.green);
					g.fillOval(j * x, i * y, w, h);
				} else {
					g.setColor(Color.white);
					g.fillRect(j * x, i * y, w, h);
				}
			}
		}
	}
}
