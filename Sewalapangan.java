import java.util.Scanner;

public class Sewalapangan {
    private int tglsewa;

    public int getTglsewa() {
        return tglsewa;
    }

    public void setTglsewa(int tglsewa) {
        this.tglsewa = tglsewa;
    }

    public void output(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tanggal sewa : ");
        setTglsewa(input.nextInt());
    }

}
