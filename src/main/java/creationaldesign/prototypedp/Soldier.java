package creationaldesign.prototypedp;

public class Soldier implements Cloneable {

	private int health;
	private int speed;
	private int maxLifeTime;
	private int agitiliy;
	private int power;
	private int rank;
	private String weapon;
	private boolean isAvailableForWar;

	public Soldier(int health, int speed, int maxLifeTime, int agitiliy, int power, int rank, String weapon,
			boolean isAvailableForWar) {
		super();
		this.health = health;
		this.speed = speed;
		this.maxLifeTime = maxLifeTime;
		this.agitiliy = agitiliy;
		this.power = power;
		this.rank = rank;
		this.weapon = weapon;
		this.isAvailableForWar = isAvailableForWar;
	}

	public void showSoldierInfo() {
		System.out.println("Health :" + health);
		System.out.println("Speed :" + health);
		System.out.println("Life Time :" + health);
		System.out.println("Agility :" + health);
		System.out.println("Power :" + health);
		System.out.println("Rank :" + health);
		System.out.println("Weapon :" + health);
		if (isAvailableForWar) {
			System.out.println("Ready for war");
		} else {
			System.out.println("Not ready for war");
		}

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxLifeTime() {
		return maxLifeTime;
	}

	public void setMaxLifeTime(int maxLifeTime) {
		this.maxLifeTime = maxLifeTime;
	}

	public int getAgitiliy() {
		return agitiliy;
	}

	public void setAgitiliy(int agitiliy) {
		this.agitiliy = agitiliy;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public boolean isAvailableForWar() {
		return isAvailableForWar;
	}

	public void setAvailableForWar(boolean isAvailableForWar) {
		this.isAvailableForWar = isAvailableForWar;
	}

	@Override
	public Object clone() {

		Soldier soldier = null;
		try {

			soldier = (Soldier) super.clone();

		} catch (CloneNotSupportedException e) {

			System.out.println("Clone yapilamadi");
			e.printStackTrace();

		}

		return soldier;

	}

}
