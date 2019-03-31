package lesson1.animals;

import lesson1.behavers.Jump;
import lesson1.behavers.Run;
import lesson1.valuestype.Gender;


public abstract class Animal implements Jump, Run
{
  private int age;
  private String name;
  private Gender gender;

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public Animal(Gender gender)
  {
    this.gender = gender;
  }

  public Animal(int age, Gender gender)
  {
    this.age = age;
    this.gender = gender;
  }

  public Gender getGender()
  {
    return gender;
  }

  public void setGender(Gender gender)
  {
    this.gender = gender;
  }

  public Animal(int age, String name, Gender gender)
  {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
