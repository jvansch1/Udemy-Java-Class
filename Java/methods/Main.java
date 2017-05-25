
public class Main {

  public static void main(String[] args) {
    String name = "Johnny V";
    int position = calculateHighScorePosition(1500);
    displayHighScorePosition(name, position);
    position = calculateHighScorePosition(900);
    displayHighScorePosition(name, position);
    position = calculateHighScorePosition(400);
    displayHighScorePosition(name, position);
    position = calculateHighScorePosition(50);
    displayHighScorePosition(name, position);
  }
  // public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
  //   if (gameOver) {
  //     int finalScore = score + (levelCompleted * bonus);
  //     return finalScore;
  //   }
  //   return 0;
  // }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high scores table \n");
  }

  public static int calculateHighScorePosition(int score) {
    if (score > 1000) {
      return 1;
    } else if (score > 500) {
      return 2;
    } else if (score > 100) {
      return 3;
    } else {
      return 4;
    }
  }
}
