package Day3;

public class Assignment3Part1 {
	
		

			public static void main(String[] args) {

				int input = 16;
				int maxDistance = (int) Math.ceil(Math.sqrt(input));
				int distance = 0;

				if (maxDistance % 2 == 0) {
					maxDistance += 1;
				}
				System.out.println(maxDistance);

				int center = maxDistance / 2;
				int x = center;
				int y = center;
				int grid[][] = new int[maxDistance][maxDistance];
				int n = 1;

				for (int i = 1; i <= maxDistance; i += 2) {
					for (int j = 0; j < i - 2; j++) {
						grid[x][y] = n++;
						y -= 1;
					}
					for (int j = 0; j < i - 1; j++) {
						grid[x][y] = n++;
						x -= 1;
					}
					for (int j = 0; j < i - 1; j++) {
						grid[x][y] = n++;
						y += 1;
					}
					for (int j = 0; j < i; j++) {
						grid[x][y] = n++;
						x += 1;
					}
				}

				for (y = 0; y < maxDistance; y++) {
					for (x = 0; x < maxDistance; x++) {
						if (grid[x][y] == input) {
							distance = Math.abs(x - center) + Math.abs(y - center);
						}
					}
				}

				System.out.println(distance);

			}

		}



