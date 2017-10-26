package Sprint1;

public class SubClass extends SuperClass {

    public SubClass(){
        super();
    }

    @Override
    public void getMessage() {      // Overriding, trækker getMessage ind i sub.
        System.out.println("This is the SUBCLASS message" + objectmessage);
    }



}
