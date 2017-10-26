package Sprint2;

public class Objekt {

    String navn;
    int alder;

    Objekt(String navn, int alder){             // Objekt med navn og alder, som skal printes i "Run"

        this.navn = navn;
        this.alder = alder;
    }

    public String toString() {          // toString metode som returner navn og alder
        return navn +" "+ alder;
    }

}
