package Phonebook_L3;

import java.util.*;



public class LaunchProgramme
{

  public static void main(String[] args)
  {
    //firstWork();

    secondTask();


  }

  private static void secondTask()
  {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Vasya", "+777777");
    phonebook.add("Vasya", "+777778");

    Set<String> records = phonebook.get("Vasya");

    System.out.println("  ########### RESULT OF 2 TASK ##################");

    if (Objects.nonNull(records))
    {
      for (String record : records)
      {
        System.out.println(record);
      }
    }
    else
    {
      System.out.println("We can't find");
    }
  }


  private static void firstWork()
  {
    List<String> source = new ArrayList<>();
    source.add("a");
    source.add("b");
    source.add("b");
    source.add("b");
    source.add("c");
    source.add("c");
    source.add("c");

    Map<String, Integer> result = new HashMap<>();

    for (String value : source)
    {
      Integer count = result.get(value);
      if (Objects.isNull(count))
      {
        count = 0;
      }

      count += 1;
      result.put(value, count);
    }

    System.out.println("  ########### RESULT OF 1 TASK ##################");
    System.out.println("Unique values count = " + result.size() + ".");

    for (Map.Entry<String, Integer> entry : result.entrySet())
    {
      String value = entry.getKey();
      Integer count = entry.getValue();

      System.out.println("Character = " + value + ", Count = " + count);
    }
  }
}
