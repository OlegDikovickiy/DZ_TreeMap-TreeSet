import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    List<Person> people = generatePerson();

    PersonComparator personComparator = new PersonComparator();
    people.sort(personComparator);

    System.out.println(people.stream().map(Person::toString).collect(Collectors.joining("\n")));


  }

  private static List<Person> generatePerson(){
    return Stream.of(
        new Person("Nikita", "Fin-lan", 13),
        new Person("Egor", "Fin-tan-sin-man", 15),
        new Person("Oleg", "Fin-lan-team", 23),
        new Person("Igor", "Sun-tree", 55)
    ).collect(Collectors.toList());
  }
}
