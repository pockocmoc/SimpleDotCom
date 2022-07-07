public class SimpleDotCom {
    int[] loctionCells;
    int numOfHits = 0;

    public void setLoctionCells(int[] locs) {
        loctionCells = locs;
    }
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : loctionCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == loctionCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
