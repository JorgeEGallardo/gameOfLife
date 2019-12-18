package gameOfLaifu;

import java.util.Random;

public class cell {
	int w = 100;
	int state;
	int x;
	int y;
	int livestem;

	int getState() {
		return state;
	}

	void init(int i, int j) {
		Random rnd = new Random();
		state = rnd.nextInt(2);
		x = i;
		y = j;
	}

	int dead(cell[][] cells) {
		if (count(cells) == 3) {

			return 1;

		}
		return state;
	}

	int alive(cell[][] cells) {
		if (!(count(cells) == 3 || count(cells) == 2)) {

			return 0;
		}
		return state;
	}

	int count(cell[][] cells) {
		int lives = 0;
		int xtemp = x - 1;
		int ytemp = y - 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!((i == 1 && j == 1) || (xtemp + i >= w || ytemp + j >= w) || (xtemp + i < 0 || ytemp + j < 0))) {
					if (cells[xtemp + i][ytemp + j].getState() == 1) {
						lives++;
					}
				}

			}
		}
		return lives;
	}

	int setState(cell[][] cells) {
		if (state == 1)
			return alive(cells);
		else
			return dead(cells);
	}

	void forceState(int st) {
		state = st;
	}
}
