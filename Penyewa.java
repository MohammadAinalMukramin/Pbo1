import java.util.Scanner;

public class Penyewa{
    private String nampen;
    private int notelp;

    public String getNampen() {
        return nampen;
    }

    public void setNampen(String nampen) {
        this.nampen = nampen;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }
    public void output(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Penyewa : ");
        setNampen(input.next());
        System.out.println("Masukkan no telp penyewa : ");
        setNotelp(input.nextInt());
        System.out.println("Nama Penyewa : "+this.nampen);
        System.out.println("No telp penyewa : "+this.notelp);
    }
}