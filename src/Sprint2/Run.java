package Sprint2;

import java.util.Objects;

public class Run {

    public static void main(String[] args) {

        Objekt obj = new Objekt("Mikkel", 20);
        System.out.println(obj.toString());

        Run s = new Run();
        System.out.println(s instanceof Run);       // Instanceof, som beskriver med true eller false om dit argument er del af noget (s er instaneof run, da den lige er lavet)

        int q = 12;
        String qw = "Cykablyatidinachoej";              // Equals, some (efter test) både kan anskue om der er tale om int eller String.
        boolean equal = Objects.equals(q, qw);          // Vil give dig en boolean value(true,false) afhængig af værdier.
        System.out.println(equal);
    }


}

