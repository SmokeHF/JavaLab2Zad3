
public class Main {
    public static void main(String[] args) {

        int randomNumber=(int)(Math.random()*100);
        System.out.println("Random number: "+randomNumber);
        if(randomNumber%2==0)
            System.out.println("Jest parzysta");
        else{
            System.out.println("Nie jest parzysta");

        }


    }
}