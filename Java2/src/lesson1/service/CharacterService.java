package lesson1.service;

import lesson1.valuestype.ActType;
import lesson1.animals.CharacterValue;
import lesson1.valuestype.Gender;

public interface CharacterService
{

  CharacterValue getCharacterValue(ActType actType);

  CharacterValue getCharacterValue(ActType actType, Gender gender);

}
