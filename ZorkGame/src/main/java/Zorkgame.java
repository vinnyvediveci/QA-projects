import java.util.Scanner;

public class Zorkgame {
	
	private int[] playerCoordinates = new int[2];
	
	public int SwampMap() {
		int[][] swampArray = new int[][]{
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
			};
			
	 	System.out.println(swampArray[2][5]);
		return 0;
		
	}
public Zorkgame() {
		playerCoordinates[0] = 4;
		playerCoordinates[1] = 5;
		move();
	}
	public void move() {
		Scanner movement = new Scanner(System.in);
		System.out.println("Which direction do you want to move?");
		System.out.print("> ");
        String direction = movement.nextLine();
        
		switch (direction){
		case "north": 
			if (playerCoordinates[0] == 0) {
				System.out.println("no north");
			}else {
				playerCoordinates[0]--;
			}
			System.out.println(playerCoordinates[0]+ " "+ playerCoordinates[1]);
			break;
			
		case "east": 
			if (playerCoordinates[1] == 9) {
				System.out.println("no east");
			}else {
				playerCoordinates[1]++;
			}
			System.out.println(playerCoordinates[0]+ " "+ playerCoordinates[1]);
			break;
			
		case "south": 
			if (playerCoordinates[0] == 9) {
				System.out.println("no south");
			}else {
				playerCoordinates[0]++;
			}
			System.out.println(playerCoordinates[0]+ " "+ playerCoordinates[1]);
			break;
		
		case "west": 
			if (playerCoordinates[1] == 0) {
				System.out.println("no east");
			} else {
				playerCoordinates[1]--;
			}
			System.out.println(playerCoordinates[0]+ " "+ playerCoordinates[1]);
			break;
		
		
		}
		gameActions(); 
		move();
		
		
		}
	

	public void gameActions() {
		if (this.playerCoordinates[0] == 3 && this.playerCoordinates[1] == 5) {
			murderHouse(); }
		if (this.playerCoordinates[0] == 2 && this.playerCoordinates[1] == 5) {
			snakePit();
		} if (this.playerCoordinates[0] == 1 && this.playerCoordinates[1] == 5) {
			bears();
		} 
		
	}
	 public String murderHouse() {
		 System.out.println("You stumble into a house");
		 System.out.println("A man is sleeping in the corner, your entry wakes him up");
		 System.out.println("He screams, waves a large machete and leaps at you");
		 System.out.println("What do you do?");
		 Scanner action = new Scanner(System.in);
		 System.out.println("> "); 
		 
		 while(action.toString() == action.toString()) {
	     if(action.toString() == "run") {
			 dead();
		 } else if (action.toString() == "hide") {
			 dead();
		 } else if (action.toString() == "hit him over the head with a chair") {
			 System.out.println("Well done! move forward!");
			 move();
		 } else {System.out.println("Did not understand input");
	 
		 };
		 }
		return null;
		
		 
		
	 }
	 
	 public String snakePit() {
		 System.out.println("As you are walking, the ground suddenly gives way below you");
		 System.out.println("You fall headlong onto a raised dais at a bottom of the pit. You look around, and see a mass of snakes!");
		 System.out.println("What do you do?");
		return null;
		 
		
		 } 
	 
	 public String bears() {  
		 System.out.println("As you are walking, the ground suddenly gives way below you");
		 System.out.println("You fall headlong onto a raised dais at a bottom of the pit. You look around, and see a mass of snakes!");
		 System.out.println("What do you do?");
		return null;
		 
			 
	 }
	public void dead() {
		System.out.println("You're dead!");
	}
}
