package methods;

public class MethodTasks {
    public static void main(String[] args) {
        MethodTasks main = new MethodTasks();


        System.out.println(main.myPow(2, 2));

        System.out.println(main.NWD(101, 77));
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        // ***** dla chętnych ******
        if(b == 0){
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    public boolean pitagoras(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    public int sum(int a){
        int sum = 0;
        while (a != 0){
            sum += a % 10;
            a /= 10;
    }
        return sum;
    }

    public int sumDigit (int a){
        return a == 0 ? 0 : a%10 + sumDigit(a/10);
    }

    public boolean isSquare(int a){
        return Math.sqrt(a) % 1 == 0;
    }

    public boolean isSquare1(int a){
        for(int i = 1; Math.sqrt(a) >= i; i++){
            if(i * i == a){
                return true;
            }
        }
        return false;
    }

    public boolean isPrime(int a){
        if(a == 2) {
            return true;
        }else if(a == 1 || a % 2 == 0){
            return  false;
        }
        for(int i = 3; i <= Math.sqrt(a); i += 2){
             if(a % i == 0){
                 return false;
             }
        }
        return true;
    }

    public boolean isSquare2(int a){
        return Math.pow(a, 1/3D) % 1 == 0;
    }

    public int max(int a, int b){
        return a > b ? a : b;
    }

    public int max1(int a, int b){
        return Math.max(a, b);
    }

    public int dividers(int a){
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if(a % i == 0){
                counter++;
            }
        }
        return counter;
    }

    public int dividersAll(){
        int number = 0;
        int counter = 0;
        for(int i = 2; i <= 10000; i++) {
            int dividers = dividers(i);
            if (counter < dividers) {
                number = i;
                counter = dividers;
            }
        }
        return number;
    }

    public int myPow(int a, int n){
        int sum = a;
        for(int i = 1; i < n; i++) {
            sum *= a;
        }
        return sum;
    }


    public int NWD(int a, int b){
        while ( a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }

    public int NWD1(int a, int b){

        for(int i =a; i>=1; i--){
            if (b%a!=0){
                a--;
            }
        }
        return a;
    }

}
