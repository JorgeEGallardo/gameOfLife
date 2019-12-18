package gameOfLaifu;

public class board {
	static int w = 100;
	static cells cells = new cells();
	static cells newCells = new cells();

	void Initgame() {
		System.out.println("");

	}

	public static cells turn() {
		newCells = cells;

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				newCells.cells[i][j].forceState(cells.cells[i][j].setState(cells.cells));

			}

			System.out.println("");
		}
		cells = newCells;
		return cells;
	}

}