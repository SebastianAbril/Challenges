public class GetPeopleBudget {


    public static double getBudgets(Person[] persons) {
        double sumOfBudgets = 0;
        for(int i=0; i< persons.length; i++){
            sumOfBudgets += persons[i].getBudget();
        }

        return sumOfBudgets;
    }



    public static void main (String[] args){
        Person John = new Person("john",20,23000);
        Person Diana = new Person("Diana",20,27000);
        Person Sebastian = new Person("Sebastian",20,40000);
        Person Angelica = new Person("Angelica",20,50000);
        Person[] arrayPruebaPersonas = {John,Diana,Sebastian,Angelica};

        System.out.println(getBudgets(arrayPruebaPersonas));
    }
}

class Person{
    private String name;
    private int age;
    private double budget;

    public Person(String name, int age, double budget) {
        super();
        this.name = name;
        this.age = age;
        this.budget = budget;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
}
