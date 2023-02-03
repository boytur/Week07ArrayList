package Week07ArrayList.Lab08_02;

public class telephone {
    String name ;
    String  number ;

    public telephone (){}

    public telephone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString (){
        return "Name : "+ " "+getName() +" Phone : "+ getNumber();
    }

    public int size() {
        return 0;
    }
}
