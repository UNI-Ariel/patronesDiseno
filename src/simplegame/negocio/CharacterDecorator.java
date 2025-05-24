package simplegame.negocio;

public abstract class CharacterDecorator extends Character {
  protected Character character;

  public CharacterDecorator(Character character) {
    super(character.getName(), character.getAttack(), character.getLuck(), 
        character.getLife(), character.getDefense(), character.getEvasion());
    this.character = character;
  }
}
