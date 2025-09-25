package colorcoder;

public class ColorCodeUtils {
    public static final int NUMBER_OF_MAJOR_COLORS = MajorColor.values().length;
    public static final int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / NUMBER_OF_MINOR_COLORS);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }
}
