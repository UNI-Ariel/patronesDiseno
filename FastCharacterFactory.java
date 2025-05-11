public class FastCharacterFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name){
      return new Character(name, 14, 6, 30, 8, 6);
    }
}
