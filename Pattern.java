

public class Pattern{
    /**
     * @param args
     */
    public static void main(String[] args){

        /**
         * Patter : Hollow Rectangle 
         * *****
           *   *
           *   *
           *****

        int n = 4; // outer loop 
        int m = 5; // inner loop; 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(j == 1 || j == m || i == 1 || i == n){
                    System.out.print("*"); 
                } else{
                    System.out.print(" "); 
                }

            }
            System.out.println();
        }
            * */

            /*
               Half Pyramid 
             *
               *
               **
               ***
               ****

            int n = 4; // outer loop 
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*"); 
                }
                System.out.println();
            }

             */

            /*
             * inverted pyramid 
             * 
             * 
               ****
               ***
               **
               *
              
            

            int n = 4; // outer loop 
            for(int i = n; i > 0; i--){
                for(int j = 1; j <= i; j++){
                    System.out.print("*"); 
                }
                System.out.println();
            }

            */

            /*
             * inverted half pyramid 
                *
               **
              ***
             ****

            int n = 4; 
            for(int i = n; i > 0; i--){
                for(int j = 1; j <=n; j++){
                   if(j >= i){
                    System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                }
                System.out.println();
            }

            * 
             */

             /*
              * 
                     1
                     12
                     123
                     1234
                     12345
              
             int n = 5; 
             for(int i = 1; i <= n;i++){
                for(int j = 1; j <=n; j++){
                    if(j <= i){
                        System.out.print(j);
                    }
                }
                System.out.println();
             }
                */
 /*
              * 
                     12345
                     1234
                     123
                     12
                     1
              

                int n = 5; 
                for(int i = n; i > 0; i--){
                    for(int j = 1 ; j <= n; j++){
                        if(j <= i){
                            System.out.print(j);
                        }
                    }
                    System.out.println();
                }
                    */

                    /**
                     * 1 
                     * 2 3
                     * 4 5 6 
                     * 7 8 9 10
                     * 11 12 13 14 15
                    
            int n = 5; // outer loop 
            int num = 1; 
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(num + " "); 
                    num++; 
                }
                System.out.println();
            }
                 */

/* 
                 1
                 01
                 101
                 0101
                 10101

                int n = 5; // outer loop 
                int num = 1; 
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j <= i; j++){
                        int sum = i + j; 
                        if( sum % 2 == 0){
                            System.out.print(1);
                        }
                        else{
                            System.out.print(0);
                        }
                        
                        
                        
                        
                    }
                    System.out.println();
                }
*/
/**
 * 
 * 
 *  *****
   ***** 
  *****  
 *****   
*****    

 int n = 5; 
 int m = 10; 
 for(int i = 1; i <= n; i++){
    for(int j = 1; j < m; j++){
        int sum = j + i; 
        if(sum >= 6 && sum <= 10){
            System.out.print("*");
        }else{
            System.out.print(" ");
            }
    }
    System.out.println();
 } 
  */

  /**
   * 1
   * 22
   * 333
   * 4444
   * 55555
   

  int n = 5; 
  for(int i = 1; i <= n;i++){
     for(int j = 1; j <=n; j++){
         if(j <= i){
             System.out.print(i);
         }
     }
     System.out.println();
  }
     */

     
/**
 * 
 * 
 * 
 *   1
   212
  32123
 4321234
543212345


     int n = 5; 
     for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--) {
            System.out.print(j);
        }
        for(int j=2; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
 */

    }
           

    }
  



