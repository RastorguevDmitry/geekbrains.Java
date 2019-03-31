package lesson1.animals;

import lesson1.service.CharacterService;
import lesson1.service.impl.CatCharacterService;
import lesson1.valuestype.ActType;
import lesson1.valuestype.Gender;


public class Cat extends Animal
{
  private CharacterService characterService = new CatCharacterService();

  public Cat(Gender gender)
  {
    super(gender);
  }

  public Cat(int age, Gender gender)
  {
    super(age, gender);
  }

  public Cat(int age, String name, Gender gender)
  {
    super(age, name, gender);
  }

  @Override
  public int jump()
  {
    CharacterValue characterValue = characterService.getCharacterValue(ActType.JUMP, getGender());
    return characterValue.getValue();
  }

  @Override
  public int run()
  {
    CharacterValue characterValue = characterService.getCharacterValue(ActType.RUN, getGender());
    return characterValue.getValue();
  }

}
