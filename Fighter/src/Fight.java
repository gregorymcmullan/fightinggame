
public class Fight
	{
private String warrior;
private String weapon;
private double Hp;

public Fight(String a,String b,double w) {
	warrior = a;
	weapon = b;
 Hp = w;
}




public double getHp()
	{
		return Hp;
	}




public void setHp(double hp)
	{
		Hp = hp;
	}




public String getWarrior()
	{
		return warrior;
	}


public void setWarrior(String warrior)
	{
		this.warrior = warrior;
	}


public String getWeapon()
	{
		return weapon;
	}


public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	}
