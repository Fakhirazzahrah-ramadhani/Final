public class Lingkaran extends BangunanLingkaran{
    //constractor
    Lingkaran (double jariJari){
        super(jariJari);
    }

    @Override
    double hitungLuas(double jariJari){
        return  3.14 * jariJari* jariJari;
    }
}
