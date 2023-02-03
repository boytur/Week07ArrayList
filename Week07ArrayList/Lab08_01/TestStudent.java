package Week07ArrayList.Lab08_01;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numberOfPerson = kb.nextInt();
        
        ArrayList<Student> s1 = new ArrayList<Student>();

        for (int i = 0 ; i < numberOfPerson ; i++ ){
            int idInputFromUser = kb.nextInt();
            String nameInputFromUser = kb.next();
            double gradeInputFromUser = kb.nextDouble();
            s1.add(new Student(idInputFromUser,nameInputFromUser,gradeInputFromUser));
        }

        for (int i = 0 ; i < numberOfPerson ; i++){
            System.out.println(s1.get(i).toString());
        }
    }
}
