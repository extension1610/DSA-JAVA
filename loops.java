
// // import java.util.Scanner;


// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     for(int i=1;i<=5;i++){
// //     System.out.println("hello");}
// //   }
// // }


// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     for(int i=7;i<12;i++){
// //     System.out.println("hello");}
// //   }
// // }


// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     for(int i=1;i<=100;i++){
// //     // System.out.println(i);
// //     System.out.print(i+" ");}
// //   }
// // }


// // import java.util.Scanner;

// // class loop{
// //   public static void main(String[] args) {
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter num:");
// //     int x = sc.nextInt();
// //     for(int i=1;i<=x;i++)
// //     System.out.println("Yashika"+i);
// //   }
// // }


// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     int i;
  
// //     for( i=1;i<=100;i++){
// //       if(i%2==0)
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}

// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     int i;
  
// //     for( i=1;i<=100;i++){
// //       if(i%2!=0)
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}

// class loo {
//   public static void main(String[] args) {
//     System.out.println("what to do when you are");
//     int i;
  
//     for( i=17;i<=170;i=i+17){
    
//     // System.out.println(i);
//     System.out.print(i+" ");
  
//   }
// }}


// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     int i;
  
// //     for( i=2;i<=100;i=i+2){
      
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}



// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     int i;
  
// //     for( i=1;i<=100;i=i+2){
// //       if(i%3==0)
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}

// // import java.util.Scanner;
// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     Scanner sc = new Scanner(System.in);
// //     int x = sc.nextInt();
  
// //     for(int i=x;i>=1;i--){
      
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}

// // import java.util.Scanner;

// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
    
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter num:");
// //     int x = sc.nextInt();
// //     int i;
// //     for(i=2;i<=3*x-1; i=i+3){
      
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}


// // class loops {
// //   public static void main(String[] args) {
// //     System.out.println("what to do when you are");
// //     int i;
// //     for(i=99;i>=0;i=i-4){
    
// //     // System.out.println(i);
// //     System.out.print(i+" ");
  
// //   }
// // }}
// // import java.util.Scanner;
// // class gp{
// //   public static void main(String[] args) {
// //     Scanner sc = new Scanner(System.in);
// //     int n = sc.nextInt();
// //     int a = 1;
// //     int r = 2;
// //     for (int i=1; i<=n; i++) {
// //       System.out.println(a);
// //         a*=r; }
// //   }
// // }


// // class ascii{
// //   public static void main(String[] args) {
// //     for(int i=65;i<=90;i++){
// //       System.out.println((char)i+""+i);
// //     }
// //   }
// // }

// class num{
//   public static void main(String[] args) {
//     int i=1;
//     while(i<=10){
//       System.out.println(i);
//       i++;
//     }
//   }
// }

// import java.util.*;
// class digitsnumber{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the number: ");
//     int n = sc.nextInt();
//     //here n ko 0 ke equal ke baad n=9 ya fir koi bhi ek single digit rakh do no problem.
//     if(n==0) n=9;
//     int count = 0;
//     while(n!=0){
//       n/=10;
//       count++;
//     }System.out.println(count);
//   }
// }


// import java.util.*;
// class sumofdigits{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number: ");
//     int n = sc.nextInt();
//     // int count = 0;
//     int sum = 0;
//     while(n!=0){
//       sum+=n%10;
//       n/=10;

//     }System.out.println(sum>0 ? sum : -sum);
//   }
// }



import java.util.*;
class factorial{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int fact = 1;
    for(int i=1;i<=n;i++){
      fact*= i;

    }System.out.println(fact);
  }
}