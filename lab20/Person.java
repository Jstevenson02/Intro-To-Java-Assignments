import java.util.Scanner;

public class Person
{
    private static int numberOfObjectsCreated = 100;
    private String name = "nothing";
    private int age = 1000;

    public Person()
    {
        numberOfObjectsCreated++;
    }

    public Person(String name)
    {
        numberOfObjectsCreated++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfObjectsCreated++;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age)
    {  
        this.age = age;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    public static int getNumberOfObjectsRunning()
    {
        return numberOfObjectsCreated;
    }

    public static void pringArray(Person[] ar)
    {
        for (int i = 0; i < ar.length; ++i)
          {
            System.out.print(ar[i] + " ");
          }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        System.out.println(Person.getNumberOfObjectsRunning());

        Person john = new Person("john", 21);
        System.out.println("number of object so far: "
                + Person.getNumberOfObjectsRunning());

        Person mary = new Person();
        mary.setName("mary");

        mary.setAge(18);
        System.out.println(john);
        System.out.println(mary.toString());
        System.out.println("number of object so far: "
                + Person.getNumberOfObjectsRunning());

        Person paul = new Person("paul");
        System.out.println(paul);
        System.out.println("number of object so far: "
                + Person.getNumberOfObjectsRunning());

        Person[] arPerson = new Person[3];
        Person.pringArray(arPerson);

        arPerson[0] = john;
        arPerson[1] = mary;
        arPerson[2] = paul;
        Person.pringArray(arPerson);

        Person[] persons = Person.read3Persons();
        Person.pringArray(persons);
    }
    public static Person[] read3Persons()
    {
        Scanner scan = new Scanner(System.in);
        Person[] ar = new Person[3];
        for (int i = 0; i < 3; ++i)
          {
            System.out.println("enter person's name followed by age");
            ar[i] = new Person(scan.next(), scan.nextInt());
          }
        return ar;
    }
}