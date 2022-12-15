public class Segitiga extends Bangunan{
    //constractor
    Segitiga (double panjang,double lebar){
        super(panjang,lebar);
    }

    @Override
    double hitungLuas (double panjang,double lebar)
    {
        return 0.5 * panjang * lebar;
    }
}
