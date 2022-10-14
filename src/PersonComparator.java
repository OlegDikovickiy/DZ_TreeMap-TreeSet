import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
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
  }
}
