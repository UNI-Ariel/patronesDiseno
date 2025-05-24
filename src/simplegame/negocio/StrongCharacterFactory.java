package simplegame.negocio;

//Clase que implementa CharacterFactory

public class StrongCharacterFactory implements CharacterFactory{
  @Override
  public Character createCharacter(String name){
    return new Character(name, 20, 2, 40, 10, 2);
  }
}
