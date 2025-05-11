public class Main {
  public static void main(String[] args) {
    Character c1 = new RandomCharacterFactory().createCharacter(null);
    Character c2 = new FastCharacterFactory().createCharacter("Speed");
    Character c3 = new StrongCharacterFactory().createCharacter("Rock");

    Logger cl1 = new CharacterLogger(c1);
    Logger cl2 = new CharacterLogger(c2);
    Logger cl3 = new CharacterLogger(c3);

    System.out.println("Personaje Aleatorio");
    cl1.logGenericDetails();
    cl1.logDamageRolls();
    cl1.logDefenseRolls();

    System.out.println("Personaje Rapido");
    cl2.logGenericDetails();
    cl2.logDamageRolls();
    cl2.logDefenseRolls();

    System.out.println("Personaje Fuerte");
    cl3.logGenericDetails();
    cl3.logDamageRolls();
    cl3.logDefenseRolls();
  }
}
