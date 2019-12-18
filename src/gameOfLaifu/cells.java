package gameOfLaifu;

public class cells {
	static public cell cells[][] = new cell[100][100];

	public cells() {
		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 100; j++) {
				cell cell2 = new cell();
				cell2.init(i, j);
				cells[i][j] = cell2;
			}
	}
}
