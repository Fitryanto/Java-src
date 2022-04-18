public abstract class Transportasi {
    RuteBehaviour ruteBehaviour;
    String awal, tujuan;

    public abstract void display();

    public void performRute() {
        ruteBehaviour.rute();
    }

    public void setRuteBehaviour(RuteBehaviour ruteBehaviour) {
        this.ruteBehaviour = ruteBehaviour;
    }

    public String getAwal() {
        return awal;
    }

    public void setAwal(String awal) {
        this.awal = awal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String toString() {
        return "Titik Awal  : " + awal +
                "\nTujuan      : " + tujuan;
    }

}
