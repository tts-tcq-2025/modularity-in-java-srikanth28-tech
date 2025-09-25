package colorcoder;

public class ReferenceManualPrinter {
    public static void printManual() {
        System.out.println("Color Code Reference Manual");
        System.out.println("----------------------------");
        for (int i = 1; i <= MajorColor.values().length * MinorColor.values().length; i++) {
            ColorPair pair = ColorCodeUtils.getColorFromPairNumber(i);
            System.out.printf("%2d -> %s%n", i, pair.toString());
        }
    }
}
