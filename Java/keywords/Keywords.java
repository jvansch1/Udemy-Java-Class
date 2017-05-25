
public class Keywords {
  public static void main(String[] args) {
    // expressions are building blocks of all Java programs



    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    boolean gameOver = true;

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.print("Your final score was " + finalScore + "\n");
      score = 10000;
      levelCompleted = 8;
      bonus = 200;
      finalScore = score + (levelCompleted * bonus);
      System.out.print("Your final score was " + finalScore + "\n");
    }
  }
}
