package Inheritance;
class Animal{
    void running()
    {
        System.out.println("Animals are running");
    }
}
class Dog extends Animal{
    void Bark()
    {
        System.out.println("The Dog is Barking");

    }
}


public class testinheritance {

    public static void main(String args[])
    {
       Dog d=new Dog();
       d.Bark();
    }


}
