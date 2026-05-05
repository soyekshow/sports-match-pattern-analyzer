package ErenSoyekOOP;

public class MatchPatternAnalyzer {
    public static void main(String[] args) {
        // Sample Match Data (Rows: Weeks, Columns: Match Slots)
        // '1': Home Win, 'X': Draw, '2': Away Win
        // Buraya analiz ettiğin 15 haftalık veriyi tamamen girebilirsin, ben örnek 5 hafta ekledim.
        char[][] matchData = {
            {'1', 'X', '1', '2', '1', '1', '2', 'X'},
            {'2', '1', '1', 'X', '2', '1', '1', '1'},
            {'1', '1', '2', 'X', '1', 'X', '2', '1'},
            {'X', '2', '1', '1', '1', '2', '1', 'X'},
            {'1', 'X', 'X', '2', '1', '1', 'X', '2'}
        };

        System.out.println("--- Sports Match Pattern Analyzer ---\n");

        // Row Analysis (Weekly Distribution)
        System.out.println("[Row Analysis - Weekly Distribution]");
        for (int i = 0; i < matchData.length; i++) {
            int home = 0, draw = 0, away = 0;
            for (int j = 0; j < matchData[i].length; j++) {
                if (matchData[i][j] == '1') home++;
                else if (matchData[i][j] == 'X') draw++;
                else if (matchData[i][j] == '2') away++;
            }
            System.out.println("Week " + (i + 1) + " -> Home(1): " + home + " | Draw(X): " + draw + " | Away(2): " + away);
        }

        // Column Analysis (Match Slot Distribution)
        System.out.println("\n[Column Analysis - Match Slot Distribution]");
        int numMatches = matchData[0].length;
        for (int j = 0; j < numMatches; j++) {
            int home = 0, draw = 0, away = 0;
            for (int i = 0; i < matchData.length; i++) {
                if (matchData[i][j] == '1') home++;
                else if (matchData[i][j] == 'X') draw++;
                else if (matchData[i][j] == '2') away++;
            }
            System.out.println("Match Slot " + (j + 1) + " Totals -> 1: " + home + " | X: " + draw + " | 2: " + away);
        }
    }
}