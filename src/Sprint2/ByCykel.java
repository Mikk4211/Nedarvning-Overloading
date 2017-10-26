package Sprint2;

public class ByCykel extends Cykel {
    private int tireWidth;

    public ByCykel(int startCadence,
                   int startSpeed,
                   int startGear,
                   int newTireWidth) {
        super(startCadence,
                startSpeed,
                startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Bycyklen har " + getTireWidth() +
                " MM jul.");
    }
    public String toString(){
        return this.getClass() + " er i " + super.startGear + ". gear og kører med " + super.startSpeed + " km i timen og har en cadens på " + super.startCadence + " og har en bredde på julene på " + this.tireWidth + " MM.";
    }
}
