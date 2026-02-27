public class OOPSBannerAppUC6 {

    // Helper method for O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for P
    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Helper method for S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Build banner using helper methods
        String[][] banner = {
                getO(),
                getO(),
                getP(),
                getS()
        };

        // Print banner
        for (int i = 0; i < banner[0].length; i++) {
            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }
            System.out.println();
        }
    }
}