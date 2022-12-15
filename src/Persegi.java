public class Persegi extends Bangunan {
    //constractor
    Persegi(double panjang, double lebar){
        super(panjang,lebar);//knp pake super?karna di bangunan adami constractor

    }

    @Override//menimpa method yang ada di abstract class bangunan
    double hitungLuas(double panjang, double lebar)
    {
        return panjang * lebar;
    }
}
