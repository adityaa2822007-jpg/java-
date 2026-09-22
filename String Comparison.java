class Main
{
  public static void main(String[] args)
  {
    String s = "Hello";
    String a = "Hello";
    String b = "hello";
   
      System.out.println(s == a);
      System.out.println(a.equals(s));
      System.out.println(a.equalsIgnoreCase(b));
  }
}
