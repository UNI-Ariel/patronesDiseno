package simplegame.negocio;

import java.util.Random;

//Clase abstracta que define algunos calculos sensillos de daño
//y que la clase Character exiende para su uso del calculo de daño
//cumpliendo con Template Method
abstract class Entity{
  public final int calculateDamage(){
    int critical = new Random().nextInt(50) < luckValue() ? 2 : 1;

    return attackValue() * critical;
  }

  public final int calculateDefense(){
    int evade = new Random().nextInt(50) < defenseValue() ? 2 : 1;

    return defenseValue() * evade;
  }

  abstract int attackValue();

  abstract int luckValue();

  abstract int defenseValue();

  abstract int evasionValue();
}