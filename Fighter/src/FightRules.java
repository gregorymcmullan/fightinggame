import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
public class FightRules
	{
	protected	static int hybridHp = 165;
	protected static int vanguardHp=150;
	protected static int assasinHp=100;
	protected static int heavyLight = 10;
		protected static boolean stillAlive;
		protected static boolean isDead; 
		static Scanner input = new Scanner(System.in);
		static ArrayList<Fight>fighter=new ArrayList<Fight>();
public static void main(String[] args)
	{
		Characters.warriorList();
		Characters.greetUser();
		Characters.fightStuff();
		
	}
public static void attackChoice() {
	while(isDead()) {
		System.out.println("[1]" +" attack");
		System.out.println("[2]" + " dodge");
		String command = input.nextLine();
	
		if(command.equals("1")) {
		System.out.println("Attack! it connected");

	}if(command.contentEquals("2")) {
		System.out.println("Dodge! the opponets attack missed");
	}
	}
	}
private static boolean isDead()
	{
	if(isDead) {
		System.out.println("you have died and lost");
		isDead = false;
		return true;
	
	}else {
		return false;
	}
	}
	public static void fight() {
		
	}
	}
