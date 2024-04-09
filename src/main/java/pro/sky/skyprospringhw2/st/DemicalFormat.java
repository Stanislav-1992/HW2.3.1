package pro.sky.skyprospringhw2.st;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DemicalFormat {

    public static DecimalFormat df = new DecimalFormat("#.##");
    public static DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    public static void setDfs(DecimalFormatSymbols dfs) {
        dfs.setDecimalSeparator('.');
    }

    public static void setDf(DecimalFormat df) {
        df.setDecimalFormatSymbols(dfs);
    }


}
