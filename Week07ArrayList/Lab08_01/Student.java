package Week07ArrayList.Lab08_01;
public class Student {
    int id ;
    String name ;
    double grade ;

    public Student (){}

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getTypeOfStudent (){
        String ids = Integer.toString(id);
        String type = "";
        if (ids.charAt(2) == '6'){
            type = " (Spacial) ";
        }
        else if (ids.charAt(2)=='1'){
            type = " (Day) " ;
        }
        return type ;
    }
    public String checkStatus (){
        String status = "";
        if (grade >= 2.00){
            status = "Normal";
        }
        else if (grade < 2.00 && grade >= 1.75){
            status = "Probation";
        }
        else if (grade < 1.75){
            status = "Retired";
        }
        return status;
    }    

    public String getStatus (){
        return checkStatus();
    }
    public String toString (){
        return getName() + " " + getTypeOfStudent() + " " + getStatus();
    }
}