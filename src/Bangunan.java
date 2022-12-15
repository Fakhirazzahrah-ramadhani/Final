public abstract class Bangunan {
    double panjang;
    double lebar;
    double luas;

    //constructor(memasukkan nilai ke dalam objek)
    Bangunan(double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = hitungLuas(this.panjang,this.lebar);
    }
    //abstract method
    abstract double hitungLuas(double panjang,double lebar);

}
