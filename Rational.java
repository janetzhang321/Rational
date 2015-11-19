/*
Team Real Pengueen - Janet Zhang, Dorothy Ng
APCS1 pd5
HW32 -- Irrationality Stops Here
2015-11-17
*/
public class Rational{
   private int n;
   private int d;
   public Rational(){
      n=0; d=1;
   }
   public Rational(int n, int d){
      if (d==0) {
         n=0;
         d=1;
         
      }
      this.n=n;
      this.d=d;
   }
   public String toString(){return n + "/" + d;}
   public double floatValue(int n, int d){
      return (n*1.0)/d;
   }
   public void multiply(Rational other){
      int otherS=other.toString().indexOf("/");
      int otherL=other.toString().length();
      int otherN=Integer.parseInt(other.toString().substring(0,otherS));
      //System.out.println(otherN);
      int otherD=Integer.parseInt(other.toString().substring(otherS+1,otherL));
      //System.out.println(otherD);
      n*=otherN;
      d*=otherD;
   }
   public void divide(Rational other){
      int otherS=other.toString().indexOf("/");
      int otherL=other.toString().length();
      int otherN=Integer.parseInt(other.toString().substring(0,otherS));
      //System.out.println(otherN);
      int otherD=Integer.parseInt(other.toString().substring(otherS+1,otherL));
      //System.out.println(otherD);
      n/=otherN;
      d/=otherD;
   }
   public static void main(String[] args) {
      Rational r = new Rational(2,3); //Stores the rational number 2/3
      Rational s = new Rational(1,2); //Stores the rational number 1/2
      System.out.println("r: "+r);
      System.out.println("s: "+s);
      r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains ½
      System.out.println("r: "+r);
      System.out.println("s: "+s);
      r.divide(s); //Multiplies r by s, changes r to 2/6.  s remains ½
      System.out.println("r: "+r);
      System.out.println("s: "+s);
      Rational goose = new Rational(2,0); //Stores the rational number 0/1 bc invalid params
      System.out.println("goose: "+goose);
   }
}
