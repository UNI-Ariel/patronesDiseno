
public class Character extends Entity {
  private String name;
  private int level;
  private int maxLevel;
  private int exp;
  private int nextExp;

  private int attack;
  private int luck;

  private int life;
  private int defense;
  private int evasion;

  public Character(String name, int attack, int luck,
      int life, int defense, int evasion) {
    this.name = name;

    this.attack = attack;
    this.luck = luck;
    this.life = life;
    this.defense = defense;
    this.evasion = evasion;

    this.level = 1;
    this.maxLevel = 100;
    this.exp = 0;
    this.nextExp = 100;
  }

  public String getName() {
    return this.name;
  }

  public int getLevel() {
    return this.level;
  }

  public int getAttack() {
    return this.attack;
  }

  public int getLuck() {
    return this.luck;
  }

  public int getLife() {
    return this.life;
  }

  public int getDefense() {
    return this.defense;
  }

  public int getEvasion() {
    return this.evasion;
  }

  private int updateNextExperience() {
    return (int) (this.nextExp * 1.15);
  }

  private void subirNivel() {
    this.level += 1;
    this.life += 15;
    this.attack += 4;
    this.luck += 1;
    this.defense += 2;
    this.evasion += 2;
  }

  public void ganarExperiencia(int exp) {
    if (this.level == this.maxLevel)
      return;

    this.exp += exp;

    if (this.exp >= this.nextExp) {
      while (this.level < this.maxLevel &&
          this.exp >= nextExp) {
        subirNivel();
        this.exp -= this.nextExp;
        updateNextExperience();
      }
    }
  }

  @Override
  int attackValue() {
    return this.attack;
  }

  @Override
  int luckValue() {
    return this.luck;
  }

  @Override
  int defenseValue() {
    return this.defense;
  }

  @Override
  int evasionValue() {
    return this.evasion;
  }
}