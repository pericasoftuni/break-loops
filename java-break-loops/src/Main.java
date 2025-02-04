
public class Main {
    public static void main(String[] args) {

        int counter = 0;

        while (true){

            System.out.println(counter);

            if(counter==5){
                System.out.println("Counter reached 5!");
                //try and see what will happen with continue and return
                break;
            }

            counter++;

        }

        System.out.println("While has ended");
    }
}