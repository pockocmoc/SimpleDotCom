public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] loctions = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLoctionCells(loctions);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам понадобилось " +numOfGuess+ " попыток(и)");
            }
        }
    }
}
