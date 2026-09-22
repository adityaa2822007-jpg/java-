class Main
{
  public static void main(String[] args)
  {
      String s = "Java is easy";
      String a = "hey";
      String b = "   HEY   ";
      String result = s.replace("easy", "powerful");
      System.out.println(result);
      System.out.println(a.toUpperCase());
      System.out.println(b.toLowerCase());
      System.out.println(b.trim());
  }
}
