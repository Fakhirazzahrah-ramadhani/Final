public abstract class BangunanLingkaran {

    double jariJari;
    double luas;

    //constractor//menginisialisasi nilai awal dari atribut objek
    BangunanLingkaran(double jariJari){
        this.jariJari = jariJari;
        this.luas = hitungLuas(this.jariJari);
    }

    //abstract method
    abstract double hitungLuas(double jariJari);
}
