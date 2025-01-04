public class starPattern{
    public static void main(String args[]) {
        int n = 4;

        // square pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // left piramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // left inverted piramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // left numeric inverted piramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // hollow rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 | i == n | j == 1 | j == n) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        // inverted and rotated half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }

        // inverted and rotated half pyramid with number
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" " + a++);
                }
            }
            System.out.println();
        }
        
        // 5 floyd's triangle
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" " + a++);
                }
            }
            System.out.println();
        }
        
        // 0 1 triangle
        int b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b);
                if (b==0) b=1;
                else
                    b = 0;
                
            }
            System.out.println();
        }
        
        // 7 butterfly
        n=7;
        for (int i = 1; i <= n/2+1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<=i | j>n-i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= i | j > n - i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
               
        // solid rhombus
        n=7;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // hollow rhombus
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 | i == n | j == 1 | j == n) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
                       }
            System.out.println();
        }
        
        // diamond 
          n=7;
          for (int i = 1; i <= n / 2 + 1; i++) {
            // System.out.print( i);
            for (int j = n/2-i+1; j >= 1; j--) {
                System.out.print("  ");
            }  
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
          for (int i = 1; i <= n / 2; i++) {

              for (int j = 1; j <= i; j++) {
                  System.out.print("  ");
              }
            for (int j = n/2-i+1; j >= 1; j--) {
                System.out.print("* ");
            }  
            for (int j = n/2-i; j >=1; j--) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}