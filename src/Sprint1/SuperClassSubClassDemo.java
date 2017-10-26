package Sprint1;

public class SuperClassSubClassDemo {




    public static void main(String[] args) {

        int x = (123+456)/123;
        System.out.println(Integer.toString(x));

        SuperClass mySuperClassObject = new SuperClass();
        SubClass mySubClassObject = new SubClass();

        mySuperClassObject.getMessage(); //Besked vi sætter
        mySubClassObject.getMessage(); // Besked vi sætter

        mySuperClassObject.setMessage("Hey you! This is a super class!"); //Her sætter vi beskeden, og printer. Superclassens besked (objectmessage) bliver printet automatisk.
        mySubClassObject.setMessage("Hey you! This is a sub class!");

        mySuperClassObject.getMessage(); //Beskeden igen
        mySubClassObject.getMessage(); //Beskeden igen{
        SuperClass s = new SuperClass();
        s.add(10, 5);
        s.add(10,5,1);   // Eksempel på overloading her.

        }
    }

