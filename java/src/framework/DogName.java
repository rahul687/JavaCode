package framework;

//Class Declaration
public class DogName {

    // Instance variable
    String name ;
    String breed ;
    int age ;
    String color;

    // Constructor declaration of class

    public DogName( String name,String breed, int age,String color)
    {
        this.name=name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName()
    {
        return name;
    }
    //method 2
    public String getBreed()
    {
        return breed;
    }

    // method 3
    public int getAge()
    {
        return age;
    }

    // method 4

    public String getColor()
    {
        return color;
    }


    @Override
    public String toString() {
        return ("Hi My name is " + this.getName()+".\n My breed,age, and color are " +
                this.getBreed()+ ","+ this.getAge()+","+this.getColor());
    }

    public static void main(String [] args)
    {
        DogName tuffy = new DogName("tuffy","Paapilon",5,"white");
        System.out.println(tuffy.toString());
    }
}
