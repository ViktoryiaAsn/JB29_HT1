package java1;

public class Task37 {

	public static void main(String[] args) {
	
		
		int N = 257;

        String digitToString = Integer.toString(N);
        char[] num = digitToString.toCharArray();
        
        int A = num.length;
      //question 1
        if (A == 2 && N%2 ==0){
            System.out.println("Question 1: " + true);
        }
        else{
            System.out.println("Question 1: " + false);   
        }
        
        //question2     
        if (A==4){
            if ((Character.getNumericValue(num[0]) + Character.getNumericValue(num[1])) == (Character.getNumericValue(num[2]) + Character.getNumericValue(num[3])))
                System.out.println("Question 2: " + true);
            else{
                System.out.println("Question 2: " + false); 
            } 
        }
        else{
            System.out.println("Question 2: " + false); 
        }

        //question3
        if (A==3){
            if ((Character.getNumericValue(num[0]) + Character.getNumericValue(num[1])+ Character.getNumericValue(num[2]) ) %2 ==0){
                System.out.println("Question 3: " + true);
            }    
            else{

                System.out.println("Question 3: " + false); 
            } 
        }
        else{
            System.out.println("Question 3: " + false); 
        }
        //question4
        if (A==4){
            int x = Character.getNumericValue(num[0]);
            int y = Character.getNumericValue(num[1]);
            int m = Character.getNumericValue(num[2]);
            int n = Character.getNumericValue(num[3]); 

           if (m<n && x>=m && x<=n){
               System.out.println("Question 4: " + true);    
           }    
           else{
               System.out.println("Question 4: " + false); 
           } 
       }
       else{
           System.out.println("Question 4: " + false); 
       }

       //question5

        if (A==3){
             int a = Character.getNumericValue(num[0]);
             int b = Character.getNumericValue(num[1]);
             int c = Character.getNumericValue(num[2]);
             
            if ((Math.pow(N,2))== Math.pow(a+b+c,3)){
                System.out.println("Question 5: " + true);    
            }    
            else{
                System.out.println("Question 5: " + false); 
            } 
        }
        else{
            System.out.println("Question 5: " + false); 
        }

        //question6
        if (A==3){
            int a = Character.getNumericValue(num[0]);
            int b = Character.getNumericValue(num[1]);
            int c = Character.getNumericValue(num[2]);
            
           if (a==b || b ==c || c==a){
               System.out.println("Question 6: " + true);    
           }    
           else{
               System.out.println("Question 6: " + false); 
           } 
       }
       else{
           System.out.println("Question 6: " + false); 
       }
      //question7
        if (A==3){
            int a = Character.getNumericValue(num[0]);
            int b = Character.getNumericValue(num[1]);
            int c = Character.getNumericValue(num[2]);
            
           if (a+c==b || b+a ==c || c+b==a){
               System.out.println("Question 7: " + true);    
           }    
           else{
               System.out.println("Question 7: " + false); 
           } 
       }
       else{
           System.out.println("Question 7: " + false); 
       }

       //question8
        boolean flag=true;
        while (flag){
            //check square root
            double root = Math.sqrt((double)N);
            //System.out.println(root);
            //System.out.println(Math.round(root));
            if (root==Math.round(root)){
                System.out.println("Question 8: " + true + " (square root) ");
                break;   
            }
            //check cube root
            double cubeRoot = Math.cbrt((double)N);
            if (cubeRoot==Math.round(cubeRoot)){
                System.out.println("Question 8: " + true + " (cube root) ");
                break;   
            }
            //check cube of four
            //here we use the following formula:
            //nRoot(num)=e**(log(num)/root)
            int fourRoot = (int) Math.pow(Math.E, Math.log((double)N)/4.0);
            if (cubeRoot==Math.round(fourRoot)){
                System.out.println("Question 8: " + true + " (root of four) ");
                break;   
            }

            System.out.println("Question 8: " + false);
            flag=false;
        }
        
        //question9
        //input: point coordinates (m,n), function coefficients a,b,c
        //does the function go through the point coordinates?
        //ASSUMPTION: int has 5 digits, where first two are the point coordinates and the last three are a,b,c function coefficients
         if (A==5){
             int m = Character.getNumericValue(num[0]);
             int n = Character.getNumericValue(num[1]);
             int a = Character.getNumericValue(num[2]);
             int b = Character.getNumericValue(num[3]);
             int c = Character.getNumericValue(num[4]);
             
            if (a*Math.pow(m,2)+b*m+c == n){
                System.out.println("Question 9: " + true);    
            }    
            else{
                System.out.println("Question 9: " + false); 
            } 
        }
        else{
            System.out.println("Question 9: " + false); 
        }
    }   


	}

