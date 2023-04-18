import java.util.Collection;
import java.util.Map;

public class GetValues {
    public static String[] getValues(Map<String,String> dict){

        Collection<String> values = dict.values();
        String[] arrayWithValues = values.toArray(new String[values.size()]);

        return arrayWithValues;

    }
}
