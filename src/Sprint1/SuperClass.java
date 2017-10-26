package Sprint1;

public class SuperClass {


    String objectmessage = "This is the original superclass message";

    public void getMessage() {
        System.out.println("This is SUPERCLASS message" + objectmessage);
    }

    public void setMessage(String newMessage) {
        this.objectmessage = newMessage;
    }

    public void add(int a, int b) {         // method uden for main argument.
        int answer = a + b;
        System.out.println("summen af dine tal giver: " + answer);
        // Denne vil jeg bruge som eksempel på overloading
    }

    public void add(int a, int b, int c) {
        int answer = a + b + c;
        System.out.println("Summen af tallene er: " + answer);
    }
}

