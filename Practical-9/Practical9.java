class Practical9{

      static void getPerformance(int size){
            long Start=0,End=0,Difference=0;
            long[] Arr = new long[size];
            for(int i=0;i<size;i++){
                  Start+=System.nanoTime();
                  Arr[i] = System.nanoTime()%30 + 1;
                  End+=System.nanoTime();
                  //Difference+=End-Start;
                  System.out.println("Initialisation of Array with "+Arr[i]+" in "+i+"th index");
            }
            //System.out.println("Average Performance Time: "+(Difference/size));
            System.out.println("Average Performance Time: "+(End-Start)+"\n");
      }
      
      static void getPerformanceOfFact1(int number){
            long Start1=0,End1=0,Start2=0,End2=0;
            int factorial1 = 2;
            if (number < 0) { 
                  System.out.println("Factorial of a negative number is not calculated"); 
                  return;
            }else if (number < 2) { 
                  System.out.println("Factorial is 1"); 
                  return;
            }
                  Start1+=System.nanoTime();
            for(int i=3;i<=number;i++){
                  //Start1+=System.nanoTime();
                  factorial1*=i;
                  //End1+=System.nanoTime();
            }
                  End1+=System.nanoTime();
            System.out.println("Average Performance Time to calculate factorial using 'FOR LOOP' of "+number+" i.e "+factorial1+" is: "+(End1-Start1)+"\n");
            
            //int i=3;
            int factorial2=2;
                Start2+=System.nanoTime();
            int i=3;
            while(i<=number){
                //Start2+=System.nanoTime();
                factorial2*=i;
                //End2+=System.nanoTime();
                i++;
            }
                End2+=System.nanoTime();
            System.out.println("Average Performance Time to calculate factorial using 'WHILE LOOP' of "+number+" i.e "+factorial2+" is: "+(End2-Start2)+"\n");
      }
      
            static long Start=0,End=0;
      static int getPerformanceOfFact2(int number){
             if (number < 0) { 
                  return 0;
            }else if (number < 2) { 
                  return 1;
            }
            
            int factorial = 2;
            Start+=System.nanoTime();
            factorial = number * getPerformanceOfFact2(number-1);
            End+=System.nanoTime();
            if(number==10) System.out.println("Average Performance Time to calculate factorial using 'RECURSSION' of "+number+" i.e "+factorial+" is: "+(End-Start)+"\n");
            return factorial;
      }
      
      static void getPerformanceOfString(int size){
            long Start=0,End=0;
            String test="";
            //String test=new String();
            for(int i=0;i<size;i++){
                  Start+=System.nanoTime();
                  //test+=Long.toString(System.nanoTime());
                  test+=System.nanoTime();
                  //test+=String.valueOf(System.nanoTime());
                  End+=System.nanoTime();
            }
            System.out.println("Average Performance Time of String: "+(End-Start)+"\n");
      }
      static void getPerformanceOfStringBuffer(int size){
            long Start=0,End=0;
            StringBuffer test= new StringBuffer();
            for(int i=0;i<size;i++){
                  Start+=System.nanoTime();
                  //test.append(Long.toString(System.nanoTime()));
                  test.append(System.nanoTime());
                  //test.append(String.valueOf(System.nanoTime()));
                  End+=System.nanoTime();
            }
            System.out.println("Average Performance Time of StringBuffer: "+(End-Start)+"\n");
      }
      static void getPerformanceOfStringBuilder(int size){
            long Start=0,End=0;
            StringBuilder test= new StringBuilder();
            for(int i=0;i<size;i++){
                  Start+=System.nanoTime();
                  //test.append(Long.toString(System.nanoTime()));
                  test.append(System.nanoTime());
                  //test.append(String.valueOf(System.nanoTime()));
                  End+=System.nanoTime();
            }
            System.out.println("Average Performance Time of StringBuilder: "+(End-Start)+"\n");
      }
      
      public static void main(String[] args){
            getPerformance(Integer.parseInt(args[0]));
            getPerformanceOfFact1(Integer.parseInt(args[0]));
            getPerformanceOfFact2(Integer.parseInt(args[0]));
            getPerformanceOfString(Integer.parseInt(args[0]));
            getPerformanceOfStringBuffer(Integer.parseInt(args[0]));
            getPerformanceOfStringBuilder(Integer.parseInt(args[0]));
            
      }
}
