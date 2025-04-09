    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if(n==1){
                    return 2;
                }
                return 2+bunnyEars(n-1);
            }
        
            public static int factorial(int n){
                if(n==1){
                    return 1;
                }
                return factorial(n-1)*n;
            }

            public static int sumNumbers(int n){
                if(n==1){
                    return 1;
                }
                return sumNumbers(n-1)+n;
            }

            public static String countDown(int n){
                if(n==0){
                    return "Blast Off!";
                }
                return n+","+ countDown(n-1);
            }

            public static int power(int x, int n){
                if(n==0){
                    return 1;
                }
                return power(x,n-1) * x;
            }

            public static int fib(int n){
                if(n==0){
                    return 0;
                }
                if(n==1){
                    return 1;
                }
                return fib(n-1)+fib(n-2);
            }

            public static int countX(String s){
                int sum=0;
                if(s.length()>1){
                    sum = countX(s.substring(1));
                }
                if(s.startsWith("x")){
                    sum++;
                }
                return sum;
            }

            public static String changePi(String s){
                if(s.length()<2){
                    return s;
                }
                String temp= changePi(s.substring(1));
                if(s.substring(0, 2).equals("pi")){
                    temp= 3.14+temp.substring(1);
                }else{
                    temp= s.substring(0,1)+temp;
                }
                return temp;
            }


            public static String reverse(String s){
                if(s.length()<=1){
                    return s;
                }
                String temp=reverse(s.substring(1));
                temp+=s.substring(0,1);
                return temp;
            }

            public static Boolean isPalindrome(String s){
                if(s.length()<=2){
                    if(s.length()==2){
                        return s.substring(0,1).equals(s.substring(1,2));
                    }
                    return true;
                }
                return (isPalindrome(s.substring(1, s.length()-1)) && s.substring(0,1).equals(s.substring(s.length()-1)));
            }

    }