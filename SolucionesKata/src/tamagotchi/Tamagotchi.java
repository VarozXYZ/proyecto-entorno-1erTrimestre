package tamagotchi;

public class Tamagotchi {
	int hunger;
	int energy;
	int mood;
	
	public Tamagotchi() {
		this.hunger = 4;
		this.energy = 4;
		this.mood = 4;
	}
	
	public void stateUpdater() {
		if (mood > 8) {
			System.out.println(":-)");
		} else if (energy <= 0) {
			this.sleep();
		} else if (energy < 3) {
			System.out.println("(-_-)");
		} else if (mood < 2) {
			System.out.println("ఠ_ఠ");
		} else {
			System.out.println(":-|");
		}
	}
	
	public void play() {
		hunger++;
		mood++;
		energy--;
		this.stateUpdater();
	}
	
	public void eat() {
		hunger -= 2;
		energy--;
		this.stateUpdater();
	}
	
	public void sleep() {
		energy += 2;
		System.out.println("(-_-) zZZ");
	}
	
	public static void main(String[] args) {
		Tamagotchi myFirstTamagotchi = new Tamagotchi();
		
		myFirstTamagotchi.play();
		myFirstTamagotchi.sleep();
		myFirstTamagotchi.sleep();
		myFirstTamagotchi.eat();
		myFirstTamagotchi.eat();
		myFirstTamagotchi.play();
		myFirstTamagotchi.play();
		myFirstTamagotchi.play();
		myFirstTamagotchi.play();
	}
}
