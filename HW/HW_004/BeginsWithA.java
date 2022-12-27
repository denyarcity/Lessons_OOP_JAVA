package HW.HW_004;

public class BeginsWithA implements IsGood<String> {

    @Override
    public boolean isGood(String arg) {
        return arg.startsWith("A");
    }
}
