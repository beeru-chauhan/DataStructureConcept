class Cookie
{
   private String color;
   public Cookie(String color)
   {
       this.color=color;
   }
   public  void setColor(String color)
   {
       this.color=color;
   }
   public void getColor()
   {
       System.out.println(color);
}

}
public class Classes {
    public static void main(String[] args) {
Cookie cookie=new Cookie("yellow");
Cookie cookie1=new Cookie("blue");
cookie.setColor("red");
cookie.getColor();
cookie1.setColor("brown");
cookie1.getColor();
    }
}
