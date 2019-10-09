import java.util.ArrayList;
import java.util.Scanner;
public class Characters
	{
		static ArrayList<Fight>fighter=new ArrayList<Fight>();
static Scanner choice = new Scanner(System.in);
		public static void main(String[] args)
	{
		Characters.warriorList();
		Characters.greetUser();
		Characters.fightStuff();
	}
	public static void warriorList() {
		fighter.add(new Fight("1) " +" Heavy,"," Shield and longsword"));
		fighter.add(new Fight("2) " +" Vanguard,"," Poleaxe"));
		fighter.add(new Fight("3) "+" Assasin,"," short sword and dagger"));
		fighter.add(new Fight("4) "+" Hybrid,"," Flail and sheild"));
		
	}
	public static void greetUser() {
		Scanner namer = new Scanner(System.in);
		System.out.println("enter your name");
		String userName= namer.nextLine();

		System.out.println("Hello " + userName + " welcome to FightNite");
 
		System.out.println("do you know how to play (y/n)");
		String myChoice = choice.nextLine();
		if(myChoice.equals("y")){
			System.out.println("ok here are your fighters");
			System.out.println();
			for(Fight f:fighter) {
				System.out.println(f.getWarrior()+f.getWeapon());
			}if(myChoice.equals("n")) {
				System.out.println("ok the game is played like a fighting game your goal is to beat your opponet."
						+ " The way you do this is by depleting your opponets HP to zero or below it. the attacks to deplet HP are basic"
						+ "there are 2 attack to choose from or to react to from the opponet, a heavy attack and light attack."
						+ "light attacks are fast and hard to react to but do little damage while heavy attacks are slow and deal big damage. ");
			}
		Scanner stats = new Scanner(System.in);
			System.out.println("now do you want to see your stats of each fighter?(y/n)");
		String look = stats.nextLine();
		if(look.equals("y")) {
			
			System.out.println("Heavy: "+ " a heavy is a tank like character represented by the name a heavy has a great amount of hp, a total of 175, and ok damage,10 per light, 25 per heavy, making it good for those who like longer fights");
			System.out.println("Vanguard: " + "Well rounded character with decent damage, 13 per light attack and 30 per heavy, and hp,a total of 150, making it great for beginners");
			System.out.println("Assasin:" + "the assasin is the most difficult character in the game because of the high risk high reward play style, it only has 100 hp but does 15 per ight and 40 per heav, making it great for those who dive head first");
			System.out.println("Hybrid: the hybrid which it sounds like is a mix of a vanguard and heavy as the hybrid is good all around with great defense, 12 per light, 27 per heavy, the hybrid has 160 hp");
		
		}if(look.contentEquals("n")) {
			System.out.println("Okay then lets get into it choose your fighter");
		}
		System.out.println();
		System.out.println("Ok choose your fighter");
		
		}
		
	}
	public static void fightStuff() {
		Scanner player= new Scanner(System.in);
		int characterChoice= player.nextInt();
		Fight myFighter= fighter.get(characterChoice-1);
	
	
	
	
	}
	
	}
