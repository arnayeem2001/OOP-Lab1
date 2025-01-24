public class to1_100 {
    public static void main(String[] args){
     int sum=0;
     int i;
     for(i=1;i<101;i++){
         sum=sum+i;
     }
         
         System.out.println(sum);
    } 
 }

 public class even {
    public static void main(String[] args){
        int a[]={10,20,30,25,27};
        for(int i=0;i<5;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
            else if (a[i]!=0) 
            {
                System.out.println(a[i]);
            }
           
        }
        
    }
}

public class odd {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 25, 27 };
        for (int i = 0; i < 5; i++) {

            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }

    }
}

public class sum {
    public static void main(String[] args){
        int a[] = { 10, 20, 30, 25, 27 };
       int sum=0;
        for(int i = 0; i < 5; i++){
            sum=sum+a[i];
        }
        int avg=sum/5;
        System.out.println(avg);
    }
}

public class to1_100 {
    public static void main(String[] args){
     int sum=0;
     int i;
     for(i=1;i<101;i++){
         sum=sum+i;
     }
         
         System.out.println(sum);
    } 
 }

 public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // Example number to check
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
