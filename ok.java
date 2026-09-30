// class ok {
//   public static void main(String[] args) {
//       int a = 5;
//       int b = 7;
//       System.out.print("your sum is:");
//       System.out.print(a+b);

//   }
  
// }

// import java.util.Scanner;

// class hi {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the Value:");

//     int a = sc.nextInt();
//     System.out.println(a*a);
//   }
// };

// import java.util.Scanner;
// class ok{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number:");
//     int a = sc.nextInt();
//     if( a%2 == 0)
//       System.out.println("It is an even");
//     else 
//       System.out.println("It is an odd");
//   }
// }

// import java.util.Scanner;

// class AbsoluteValue{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     if(a<0){
//       System.out.println(-1*a);
//     }
//     else{
//       System.out.println(a);
//     }
//   }
// }


// import java.util.Scanner;

// class profitloss{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter cp:");
//     int cp = sc.nextInt();
//     System.out.print("Enter SP:");
//     int sp = sc.nextInt();


//     if(sp>cp)
//       System.out.println("profit is happen " +(sp-cp));
//     if(sp<cp)
//       System.out.println("loss is happened "+(cp-sp));
//     if(sp==cp)
//       System.out.println("no profit no loss "+ (cp));
//   }
// }

// else if ladder 

// import java.util.Scanner;

// class integer{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter num: ");
//     int num = sc.nextInt();

//     if(num/5==0)
//       System.out.println("print number is divisible by 5");


//   }
// }

// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
    
//     if(a>999 && 10000>a)
//       System.out.println("number is btw");
//     else
//       System.out.println("wrong input");
//   }
// }
 

// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
  

//     if(a<0 && a<69)
//       System.out.println((-a)+" smaller than 69");
//     if(a>0 && a<69)
//       System.out.println(a+" is smaller than 69");
//     else
//     System.out.println(a+" the number is bigger than 69");
  
//   }}

// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
  
//     if(a%3==0 || a%5==0)
//       System.out.println("the number is divisible by 3 or 5");
//     else
//       System.out.println("not divisible by 3 or 5");
  
//   }}


// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();

//     if(a+b>c  && b+c>a && c+a>b)
//       System.out.println("this can form a triangle");
//     else
//       System.out.println("can't form triangle");
  
//   }}


// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
    
//     if(a%3==0 && a%5==0)
//       System.out.println("Riya");
//     else if(a%3==0)
//       System.out.println("Ranu");
  //   else if(a%5==0)
  //     System.out.println("Apurva");
  //   else if(a%3==0 || a%5==0)
  //     System.out.println("Isha");
  //   else
  //     System.out.println("not required number");
  
  // }}



// import java.util.Scanner;

// class greaternum{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first num: ");
//     int a = sc.nextInt();
//     System.out.print("Enter second num: ");
//     int b = sc.nextInt();
//     System.out.print("Enter third num: ");
//     int c = sc.nextInt();

//     if(a>=b && a>=c)
//       System.out.println("greater is first num "+a);
//     else if(b>=a && b>=c)
//       System.out.println("greater is second num "+b);
//     else if(c>=b && c>=a)
//       System.out.println("greater is third num "+c);
//   }
// }


// import java.util.Scanner;

// class greaternum{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first num: ");
//     int a = sc.nextInt();
//     System.out.print("Enter second num: ");
//     int b = sc.nextInt();
//     System.out.print("Enter third num: ");
//     int c = sc.nextInt();
  
  
//     if(a>=b){
//       if(a>=c)
//         System.out.println("maximum is "+a);
//       else
//         System.out.println("c");
//     }
//     else{
//       if(b>=c)
//         System.out.println("max is b");
//       else
//         System.out.println("c");
//     }
//   }}



// import java.util.Scanner;
// class hi{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();

//     System.out.println((a%2==0) ? "Even" : "Odd");
  
  
  
//   }}