/*
  Team Real Pengueen - Janet Zhang, Dorothy Ng
  APCS1 pd5
  HW32 -- Irrationality Stops Here
  2015-11-17
*/

//PHASE 1
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

    //PHASE 2
    /*
      add
      Takes 1 Rational object (just like multiply) and adds it to the current rational number object
      Need not reduce

      subtract
      Works the same as add, except the operation is subtraction

      gcd
      Returns the gcd of the numerator and denominator

      Uses Euclid's algorithm (reuse your old code!)
      Recall that in order for Euclid's algorithm to work, the first number must be greater than the second

      reduce
      Changes this Rational to one in reduced form (should use gcd)
    */
    public static int max(int a, int b){
	if (a>b){
	    return a;}
	else{
	    return b;}}//return int
    public void add(Rational other){
	int otherS=other.toString().indexOf("/");
	int otherL=other.toString().length();
	int otherN=Integer.parseInt(other.toString().substring(0,otherS));
	//System.out.println("otherN: "+otherN);
	int otherD=Integer.parseInt(other.toString().substring(otherS+1,otherL));
	//System.out.println("otherD: "+otherD);
        //System.out.println("newN1: "+n*otherD);
        //System.out.println("newD: "+d*otherD);
	int otherT=d*otherN; //System.out.println("newN2: "+otherT);
	n=n*otherD+otherT; d=d*otherD;
	System.out.println(n+"/"+d);
    }
    public void subtract(Rational other){
	int otherS=other.toString().indexOf("/");
	int otherL=other.toString().length();
	int otherN=Integer.parseInt(other.toString().substring(0,otherS));
	//System.out.println("otherN: "+otherN);
	int otherD=Integer.parseInt(other.toString().substring(otherS+1,otherL));
	//System.out.println("otherD: "+otherD);
        //System.out.println("newN1: "+n*otherD);
        //System.out.println("newD: "+d*otherD);
	int otherT=d*otherN; //System.out.println("newN2: "+otherT);
	n=n*otherD-otherT; d=d*otherD;
	System.out.println(n+"/"+d);
    }
    public static int gcd(int a, int b){
	if(a == b || a == 0 || b == 0) {
	    return max(a,b);}//the output when a and b are equal
	return gcd(a%b, b%a);//else, keep modulating until a==b(in above) and return it
    }
    public  void reduce(){
        int i=gcd(n,d);n=n/i;d=d/i;
    }
    public static void main(String[] args) {
	Rational goose = new Rational(2,0); //Stores the rational number 0/1 bc invalid params
	System.out.println("goose: "+goose);
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	//Part1
	/*
	  r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains ½
	  System.out.println("r: "+r);
	  System.out.println("s: "+s);
	  r.divide(s); //Multiplies r by s, changes r to 2/6.  s remains ½
	  System.out.println("r: "+r);
	  System.out.println("s: "+s);
	*/
	//Part2
	/*
	  System.out.println("r: "+r);
	  System.out.println("s: "+s);
	  System.out.println("t: "+t);
	  r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	  //r.subtract(s);
	  System.out.println("r: "+r);
	  System.out.println("s: "+s);
	  System.out.println("t: "+t);
	  System.out.println("gcd: "+gcd(5,6));
	  t.reduce(); //Changes t to 2/9
	  System.out.println("t: "+t);
	*/
    }
}
