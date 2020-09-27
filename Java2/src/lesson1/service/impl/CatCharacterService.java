package lesson1.service.impl;

import lesson1.animals.CharacterValue;
import lesson1.constants.Constants;
import lesson1.service.CharacterService;
import lesson1.valuestype.ActType;
import lesson1.valuestype.Gender;

public class CatCharacterService implements CharacterService {
    @Override
    public CharacterValue getCharacterValue(ActType actType) {
        CharacterValue characterValue = new CharacterValue();

        if (actType == ActType.JUMP) {
            int value = (Constants.Cat.Female.POWER + Constants.Cat.Male.POWER) / 2;
            characterValue.setValue(value);
            characterValue.setName(ActType.JUMP.toString());
        } else if (actType == ActType.RUN) {
            int value = (Constants.Cat.Female.SPEED + Constants.Cat.Male.SPEED) / 3;
            characterValue.setValue(value);
            characterValue.setName(ActType.RUN.toString());
        } else if (actType == ActType.SWIM) {
            characterValue = null;
        }

        return characterValue;
    }

    @Override
    public CharacterValue getCharacterValue(ActType actType, Gender gender) {
        CharacterValue characterValue = new CharacterValue();

        if (actType == ActType.JUMP) {
            if (gender == Gender.MALE) {
                int value = (Constants.Cat.Male.POWER) / 2;
                characterValue.setValue(value);
                characterValue.setName(ActType.JUMP.toString());
            } else {
                int value = (Constants.Cat.Female.POWER) / 5;
                characterValue.setValue(value);
                characterValue.setName(ActType.JUMP.toString());
            }
        } else if (actType == ActType.RUN) {
            if (gender == Gender.MALE) {
                int value = (Constants.Cat.Male.SPEED) / 3;
                characterValue.setValue(value);
                characterValue.setName(ActType.RUN.toString());
            } else {
                int value = (Constants.Cat.Female.SPEED) / 3;
                characterValue.setValue(value);
                characterValue.setName(ActType.RUN.toString());
            }
        } else if (actType == ActType.SWIM) {
            return null;
        }

        return characterValue;
    }
}
