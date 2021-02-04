package com.company;

public class Main {

    public static void main(String[] args) {
        // System.out.println(IsPrime(4));
        // prime();
        //firstPrimes();
        //System.out.println(perfectNum(8128));
        perfect();

    }
    //method 1
    public static boolean IsPrime(int num) {

        int temp;
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            temp = num % i;
            if (temp == 0){
                prime = false;
            }
        }
        return prime;
    }

    //method 2
public static void prime(){
        int i;
    for (i = 2; i < 1000000; i++) {
        if (IsPrime(i) == true){
            System.out.println(i);
        }
    }


}

    //method 3
public static void firstPrimes(){
        int i, cnt = 0;
    for (i = 2; i < 1000000; i++) {
        if (IsPrime(i)) {
            cnt++;
            System.out.println(i);
            }
        if (cnt == 100){
            break;
            }
        }
}

    //method 4
public static boolean perfectNum(int num){
    int sum = 0;
    boolean perfect = true;
    int i = 1;
    while(i <= num / 2)
    {
        if(num % i == 0)
        {
            sum += i;
        }
        i++;
    }
    if(sum == num)
    {
        perfect = true;
    }
    else
        perfect = false;

    return perfect;
}

//method 5
public static void perfect(){
    for (int i = 0; i < 1000000; i++) {
        if (perfectNum(i) == true){
            System.out.println(i);
        }
    }
}


}
