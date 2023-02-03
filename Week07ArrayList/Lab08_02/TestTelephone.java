package Week07ArrayList.Lab08_02;
import java.util.ArrayList;
import java.util.Scanner;

public class TestTelephone {
    public static void main(String[] args) {
        
        ArrayList<telephone> t1 = new ArrayList<telephone>();
        Scanner kb = new Scanner(System.in);
        String checkQ = " ";
        do{
            System.out.print("This program run until you key Q : ");
            checkQ = kb.next();
        } while (!checkQ.equals("Q"));

        while (checkQ.equals("Q")){
            System.out.print ("Insert what do you want : ");
            String want = kb.next();
            if (!want.equals("Q")){
                for (int i = 0 ; i < 1 ; i++){
                    if (want.equals("add")){
                        String nameInput = kb.next();
                        String teleInput = kb.next();
                        t1.add(new telephone(nameInput,teleInput));
                        System.out.println(t1.toString());
                    }
                    else if (want.equals("search")){
                        String nameIn = kb.next();
                        String result = "Not Found !";
                        for (int k = 0 ; k < t1.size();k++ ){
                            if (nameIn.equals(t1.get(k).getName())){
                               result = ("Name : " + nameIn + " Phone : "+ t1.get(k).number);
                            }
                        }
                        System.out.println(result);
                    }
                    else if (want.equals("delete")){
                        String nameIn = kb.next();
                        System.out.println("Do you confirm to delete item Y / N ");  
                        String decetion = kb.next();
                        if (decetion.equals("Y")){
                            for (int k = 0 ; k < t1.size();k++ ){
                                if (nameIn.equals(t1.get(k).getName())){
                                    t1.remove(t1.get(k));
                                }
                            }
                        }
                    }
                }
            }
            else {
                break;
            }
        }
    }
}