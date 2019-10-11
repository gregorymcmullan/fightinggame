
public class Fight
	{
private String warrior;
private String weapon;
private double Hp;
private int damager;
static String skill;
private int skillDamage;
public Fight(String a,String b,double w, int i,String f,int q) {
	warrior = a;
	weapon = b;
 Hp = w;
 damager = i;
 skill = f;
 skillDamage = q;
}




public int getSkillDamage() {
	return skillDamage;
}




public void setSkillDamage(int skillDamage) {
	this.skillDamage = skillDamage;
}




public static String getSkill() {
	return skill;
}




public static void setSkill(String skill) {
	Fight.skill = skill;
}




public int getDamager() {
	return damager;
}




public void setDamager(int damager) {
	this.damager = damager;
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
