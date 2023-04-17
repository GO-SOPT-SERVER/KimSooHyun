package firstSeminar_basic;
/*
ocp가 어떤 개념인지 학습하는 예제입니다.
 */
class HelloAnimal{
    void hello(Animal animal){
        animal.speak();
    }
}
abstract class Animal{
    abstract void speak();
}

class Cat extends Animal{
    void speak(){
        System.out.println("냥냥");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("아침 일어나기 성공!");
    }
}

public class OCP_Practice {
    public static void main(String[] args){
        HelloAnimal hello = new HelloAnimal();

        Animal cat = new Cat();
        Animal dog = new Dog();

        hello.hello(cat); //냥냥
        hello.hello(dog); //아침 일어나기 성공!

    }
}
