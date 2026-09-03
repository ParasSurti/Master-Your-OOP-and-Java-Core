    //Create a Person ---> Employee hierarchy where Employee's constructor passes name to Person's constructor via super().
    package Phase_3.INTERMEDIATE.Q04;

    public class Q04
    {
        public static void main(String[] args)
        {
            Person person = new Person("Alice");
            System.out.println(person.name);
        }
    }
