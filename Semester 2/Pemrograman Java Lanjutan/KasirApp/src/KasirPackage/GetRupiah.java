package KasirPackage;

//import java.text.DecimalFormat;

import java.util.Locale;

//import java.text.ParseException;

/**
 *
 * @author fhrlzmn
 */
public class GetRupiah {
    String harga;
    public void Rupiah(int nilai){
        //DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        //DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        //formatRp.setCurrencySymbol("Rp. ");
        //formatRp.setMonetaryDecimalSeparator(',');
        //formatRp.setMonetaryGroupingSeparator('.');
        
        //kursIndonesia.setDecimalFormatSymbols(formatRp);
        //harga = kursIndonesia.format(nilai);
        harga = String.format(Locale.GERMANY, "%,d", nilai);
    }
    
}
