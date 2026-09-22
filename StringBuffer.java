class Main
{
  public static void main(String[] args)
  {
      StringBuffer sb = new StringBuffer("Hello You");
      StringBuffer d = new StringBuffer("i am the goat");
      sb.append(" Agre");
      sb.insert(14," bhai");
      d.delete(0,1);
      d.reverse();
      
      System.out.println(sb);
      System.out.println(d);
  }
}
