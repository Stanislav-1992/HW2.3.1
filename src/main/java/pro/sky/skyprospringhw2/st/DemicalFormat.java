package pro.sky.skyprospringhw2.st;
import org.springframework.stereotype.Component;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

@Component
public class DemicalFormat {

    private static DecimalFormat df = new DecimalFormat("#.##");
    private static DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    private void setDfs(DecimalFormatSymbols dfs) {
        dfs.setDecimalSeparator('.');
    }

    private void setDf(DecimalFormat df) {
        df.setDecimalFormatSymbols(dfs);
    }

    private DemicalFormat() {
        setDfs(DemicalFormat.dfs);
        setDf(DemicalFormat.df);
    }

    public DecimalFormat getDf() {
        return df;
    }

    public  DecimalFormatSymbols getDfs() {
        return dfs;
    }
}
