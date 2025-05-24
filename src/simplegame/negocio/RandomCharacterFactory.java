package simplegame.negocio;

import java.util.Random;

//Clase que implementa CharacterFactory
public class RandomCharacterFactory implements CharacterFactory {
  private final String[] names = { "Carl", "Edge", "Lau" };
  private final int primaryStat = 20;
  private final int secondaryStat = 10;

  public Character createCharacter(String name) {
    Random rd = new Random();
    int index = rd.nextInt(names.length);
    String randomName = names[index];

    int attack = rd.nextInt(primaryStat) + 1;
    int defense = rd.nextInt(primaryStat) + 1;
    int life = (rd.nextInt(primaryStat) + 1) * 5;
    int evasion = rd.nextInt(secondaryStat) + 1;
    int luck = rd.nextInt(secondaryStat) + 1;

    return new Character(randomName, attack, luck, life, defense, evasion);
  }
}
