import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    List<Person> people = generatePerson();

    Comparator<Person> comparator;
    comparator = (Person o1, Person o2) -> {
      int lengthSurName1 = o1.getSurname().split("-").length;
      int lengthSurName2 = o2.getSurname().split("-").length;

      if (lengthSurName1 == lengthSurName2) {
        return Integer.compare(o1.getAge(), o2.getAge());
      } else {
        if (lengthSurName1 > lengthSurName2) {
          return 1;
        } else {
          return -1;
        }
      }
    };


    people.sort(comparator);

    System.out.println(people.stream().map(Person::toString).collect(Collectors.joining("\n")));


  }

  private static List<Person> generatePerson() {
    return Stream.of(new Person("Nikita", "Fin-lan", 13), new Person("Egor", "Fin-tan-sin-man", 15), new Person("Oleg", "Fin-lan-team", 23), new Person("Igor", "Sun-tree", 55)).collect(Collectors.toList());
  }
}
