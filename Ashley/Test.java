public class Test {
   public static void main(String[] args) {
       /* System.out.println(areaSquare(3,3));*/
        System.out.println(areaTriangle((3 * 4) * 1/2));
        /* int miles = 98, gallons = 5;
         double gasMileage = miles / gallons;
         System.out.println(gasMileage);
         System.out.println(2 + 3 * 4 - 6);
         System.out.println(14 / 7 * 2 + 30 / 5 + 1);
         System.out.println(14 / 7 * 2+30 / 5 + 1);
         System.out.println((238 % 10 + 3) % 7);
         System.out.println(2 + 19 % 5 - (11 * (5 / 2)));
         System.out.println(813 % 100 / 3 + 2.4);
         System.out.println(2 + 5);*/
    }  
       
    public static int add(int num1, int num2)  {
       num1 = 2;
       num2 = 3; 
       return num1 + num2;  
   
   }
    /* public static int multiply(int num1, int num2)  {
        num1 = 4;
        num2 = 5;
        return num1 * num2;
        }*/



     public static int areaRect(int num1, int num2)  {
         num1 = 2;
         num2 = 6;
         return num1 * num2;
      }
      
      public static int areaSquare(int num1, int num2) {
         num1 = 3;
         num2 = 3;
         return num1 * num2;
         }
         
      public static int areaTriangle(int num1, int num2) {
         num1 = 3;
         num2 = 4;
         return num1 * num2;
         } 
}