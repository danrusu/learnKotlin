package functions;

import static functions.DefaultParamsKt.*;

public class DefaultParamsTest {
    public static void main(String[] args) {
        connect("qatools.ro"); // default param
        connect("google.com", false);
        //connect(useProxy = false, url = "yahoo.com") // named param canot be used
    }
}
