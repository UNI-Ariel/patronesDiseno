package simplegame.negocio;

public class MagicDecorator extends CharacterDecorator{
  private int magic;

  public MagicDecorator(Character character){
    super(character);
  }
  public int getMagic(){
    return magic;
  }

  @Override
  int attackValue() {
    return super.attackValue() + magic;
  }
  
  @Override
  int defenseValue() {
    return super.defenseValue() - 10;
  }
}
