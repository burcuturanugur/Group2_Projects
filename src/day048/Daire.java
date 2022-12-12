package day048;

public class Daire {
    private int yaricap;


    public Daire() {

    }

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) throws Exception {
        if (yaricap<0) throw new LengthException();
        this.yaricap = yaricap;
    }


}


