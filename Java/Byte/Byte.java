

public class Byte {
  public static void main(String[] args) {
    byte myByte = 120;
    short myShort = 100;
    int myint = 1000;
    long myLong = 50000L + 10L * (myByte + myShort + myint);
    System.out.println(myLong);
  }
}
