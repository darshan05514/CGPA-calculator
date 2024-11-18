class Trunkcall
{
   int durration;
   Trunkcall(int d)
   {
     duration = d;
   }  
   double charge
   {
   System.out.println("charge undefined");
   return 0;
}
class Ordinary extends Trunkcall
{
     Ordinary(int d)
     {
       super(d);
     }
     double charge()  
     {
        return duration*1.0;
     }
}
class Urgent extends Trunkcall
{
     Urgent(int d)
     {
        super(d);
        }
        double charge()
        {
           return duration*2.0
           }
}
class Lightning extends Trunkcall
{
     Lighting(int d)
     {
        super(d);
        }
        double charge()
        {
           return duration*3.0
           }

}
class TrunkDemo
{
   public static void main(string args[])
   {
     Ordinary ord = new Ordinary(50);
     Urgent urg = new Urgent(40);
     Lightning lgt = new Lightning(50);
     
     System.out.println("The charge of an ordinary call is " +ord.charge());
     System.out.println("The charge of an urgent call is " +urg.charge());
     System.out.println("The charge of an lightning call is " +lgt.charge())
}
