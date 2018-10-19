import java.util.Scanner;

public class Zorkgame {
	private int[] mhouseCoordinates = new int[2];
	private int[] playerCoordinates = new int[2];
	Scanner action = new Scanner(System.in);
    String direction = action.nextLine();
    int[][] swampArray = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
	

	public Zorkgame() {
		
		playerCoordinates[0] = 4;
		playerCoordinates[1] = 5;
		
		move();
	}

	 public String enterInput() {
		 Scanner action = new Scanner(System.in);
         String direction = action.nextLine();
         return direction;
	 }
	public void move() {
		Scanner movement = new Scanner(System.in);
		System.out.println("Which direction do you want to move?");
		System.out.print("> ");
		String direction = movement.nextLine();
		

		switch (direction) {
		case "north":
			if (playerCoordinates[0] == 0) {
				System.out.println("no north");
			} else {
				playerCoordinates[0]--;
			}
			System.out.println(playerCoordinates[0] + " " + playerCoordinates[1]);
			break;

		case "east":
			if (playerCoordinates[1] == 9) {
				System.out.println("no east");
			} else {
				playerCoordinates[1]++;
			}
			System.out.println(playerCoordinates[0] + " " + playerCoordinates[1]);
			break;

		case "south":
			if (playerCoordinates[0] == 9) {
				System.out.println("no south");
			} else {
				playerCoordinates[0]++;
			}
			System.out.println(playerCoordinates[0] + " " + playerCoordinates[1]);
			break;

		case "west":
			if (playerCoordinates[1] == 0) {
				System.out.println("no east");
			} else {
				playerCoordinates[1]--;
			}
			System.out.println(playerCoordinates[0] + " " + playerCoordinates[1]);
			break;

		}
		gameActions();
		

	}
        
	public void gameActions() {
		if (this.playerCoordinates[0] == 3 && this.playerCoordinates[1] == 5) {
			murderHouse();
		}
		if (this.playerCoordinates[0] == 2 && this.playerCoordinates[1] == 5) {
			snakePit();
		}
		if (this.playerCoordinates[0] == 1 && this.playerCoordinates[1] == 5) {
			bears();
		} else {move();}

	}

	public void murderHouse() {
		System.out.println("You stumble into a house");
		System.out.println("A man is sleeping in the corner, your entry wakes him up");
		System.out.println("He screams, waves a large machete and leaps at you");
		System.out.println("What do you do?");
		System.out.print("> ");
		direction = enterInput().trim().toLowerCase();
		
	loop:	while (this.playerCoordinates[0] == 3 && this.playerCoordinates[1] == 5) {
		if (direction.equals("run")) {
				dead();
				
			} else if (direction.equals("hide")) {
				dead();
				
			} else if (direction.equals("hit him over the head with a chair")) {
				System.out.println("Well done! move on!");
				move();
				
			} else {
				System.out.println("Did not understand input");
				break loop;
   
			}
		}

	}

	public String snakePit() {
		System.out.println("As you are walking, the ground suddenly gives way below you");
		System.out.println("You fall headlong onto a raised dais at a bottom of the pit. You look around, and see a mass of snakes!");
		System.out.println("What do you do?");
		System.out.print("> ");
		direction = enterInput().trim().toLowerCase();
		
		switch(direction) {
		case direction.equals("run"): 
			System.out.println("Why would you do that?");
		dead();
		break;
		
		case direction.equals("hide")
		}

	}

	public String bears() {
		System.out.println("As you are walking, the ground suddenly gives way below you");
		System.out.println(
				"You fall headlong onto a raised dais at a bottom of the pit. You look around, and see a mass of snakes!");
		System.out.println("What do you do?");
		return null;

	}

	public void dead() {
		System.out.println("You're dead!");
		System.exit(0);
	}

	public int[] getMhouseCoordinates() {
		return mhouseCoordinates;
	}

	public void setMhouseCoordinates(int[] mhouseCoordinates) {
		this.mhouseCoordinates = mhouseCoordinates;
	}
}
