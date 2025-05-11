import java.util.Random;

abstract class Entity{
  final int calculateDamage(){
    int critical = new Random().nextInt(50) < luckValue() ? 2 : 1;

    return attackValue() * critical;
  }

  final int calculateDefense(){
    int evade = new Random().nextInt(50) < defenseValue() ? 2 : 1;

    return defenseValue() * evade;
  }

  abstract int attackValue();

  abstract int luckValue();

  abstract int defenseValue();

  abstract int evasionValue();
}