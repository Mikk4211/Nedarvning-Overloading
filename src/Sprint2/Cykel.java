package Sprint2;

public class Cykel {

   String navn;
    int startCadence;
    int startSpeed;
    int startGear;

    public void printDescription() {
    }

    public Cykel(int startCadence, int startSpeed, int startGear) {             //Deklarerer variabler
    this.startCadence = startCadence;
    this.startGear = startGear;
    this.startSpeed = startSpeed;
    this.navn = "cykel";
    }

    public String toString(){                                   // toString() metode i SuperClass, som kan bruges i alle SubClasses til at skabe cykler.
        return this.getClass() + " er i " + this.startGear + ". gear og kører med " + this.startSpeed + " km i timen og har en cadens på " + this.startCadence + ".";
    }

    public static void main(String[] args){
        Cykel bike01;                       // Deklarerer cykler
        MountainBike bike02;
        ByCykel bike03;

        bike01 = new Cykel(20, 10, 1);                      // Angiver værdier for cykler
        bike02 = new MountainBike(20, 10, 5, " Dual");
        bike03 = new ByCykel(40,20,8, 23);

        System.out.println(bike01);             // println's til at vise cyklerne.
        System.out.println(bike02);
        System.out.println(bike03);
    }
}

