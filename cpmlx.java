public class cmplx
{
 double real,img;
 cmplx(double r, double i)
  {
   this.real = r;
   this.img = i;
  }
public static cmplx sum(cmplx c1, cmplx c2)
{
 cmplx temp = new cmplx(0,0);
 temp.real = c1.real + c2.real;
 temp.img = c1.img + c2.img;
 return temp;
}
public static void main(String[] args)
{
cmplx c1 = new cmplx(5.5,4);
cmplx c2 = new cmplx(1.2,3.5);
cmplx temp = sum(c1,c2);

System.out.println("Sum is :"+temp.real+"+"+temp.img+"i");

}
}
