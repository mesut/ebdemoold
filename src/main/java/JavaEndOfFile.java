import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        consoleScanner.useDelimiter(System.getProperty("line.separator"));
        List<KeyValue> keyValueList = new ArrayList<KeyValue>();
        long count = 1;
        while (consoleScanner.hasNext()) {
            keyValueList.add(new KeyValue(count++, consoleScanner.next().toString()));
        }
        for (KeyValue keyValue : keyValueList) {
            System.out.println(keyValue.getIndex() + " " + keyValue.getValue());
        }
    }
}

class KeyValue {
    private final long index;
    private final String value;

    public KeyValue(long index, String value) {
        this.index = index;
        this.value = value;
    }

    public long getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }
}
