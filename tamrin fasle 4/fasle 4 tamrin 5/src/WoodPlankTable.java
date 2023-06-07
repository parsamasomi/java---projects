
public class WoodPlankTable {
    public static void main(String[] args) {
        System.out.println("Wood Plank Table");
        System.out.println("-----------------");
        System.out.println("Length\tWidth\tCross-Sectional Area\tMoment of Inertia");
        System.out.println("(in)\t(in)\t(sq in)\t\t\t(in^4)");
        System.out.println("--------------------------------------------------------");

        int[] lengths = {2, 4, 6, 8, 10};
        int[] widths = {2, 4, 6, 8, 10};

        for (int i = 0; i < lengths.length; i++) {
            for (int j = 0; j < widths.length; j++) {
                int length = lengths[i];
                int width = widths[j];
                int crossSectionalArea = length *

                        width;
                double momentOfInertia = (length * Math.pow(width, 3)) / 12.0;

                System.out.printf("%d\t%d\t%d\t\t\t%.2f%n", length, width, crossSectionalArea, momentOfInertia);
            }
        }
    }
}
