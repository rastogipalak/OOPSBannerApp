public class OOPSBannerAppUC7 {

    // ✅ Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // ✅ Create pattern objects
        CharacterPatternMap[] banner = {
                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPatternMap('P', new String[]{
                        " ******",
                        "*     *",
                        " ******",
                        "*      ",
                        "*      "
                }),
                new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        " ***** ",
                        "      *",
                        " ***** "
                })
        };

        // ✅ Display banner using StringBuilder
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : banner) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}