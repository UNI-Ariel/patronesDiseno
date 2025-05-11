public class CharacterLogger implements Logger {
  private Character character;

  public CharacterLogger(Character character){
    this.character = character;
  }

  @Override
  public void logGenericDetails() {
    System.out.println("Detalles del personaje " + character.getName());
    System.out.println("Vida:    " + character.getLife());
    System.out.println("Ataque:  " + character.getAttack());
    System.out.println("Defensa: " + character.getDefense());
    System.out.println("Suerte:  " + character.getLuck());
    System.out.println("Evasion: " + character.getEvasion());
  }

  public void logDamageRolls(){
    System.out.println("Attack roll: " + character.calculateDamage());
  }

  public void logDefenseRolls(){
    System.out.println("Defense roll: " + character.calculateDefense());
  }
}
