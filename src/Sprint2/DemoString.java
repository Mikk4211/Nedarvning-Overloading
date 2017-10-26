package Sprint2;

public class DemoString {


    public String navn;
    public int alder;
    public String mail;
DemoString(){

}
DemoString(String navn, int alder, String mail) {

    this.navn = navn;
    this.alder = alder;
    this.mail = mail;
}

public String toString() {
    return navn+" "+alder+" "+mail;
}
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }




}
