public class Student {

    private double weight;
    private int age;

    // constructor
    public Student(double studentWeight, int studentAge) {
        weight = studentWeight;
        age = studentAge;

    }

    // method that introduces the student
    public void introduces() {
        if (age >= 18){
            System.out.println("Hello my name is " + age + " and i am a adult ");
        }
        else{

            System.out.println("Hello my name is " + age + " and i am not a adult ");

        }

    }





    public void weights() {
        if (weight >= 300){
            System.out.println("Hello my weight is " + weight + " and its alot");
        }
        else{
            System.out.println("Hello my weight is " + weight);
        }
    }

}