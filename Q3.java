public class Q3 {
        static int n;
    
        public Q3 (int n) {
            this.n = n;
    
        }
    
        public void arm() {
            int rem, temp;
            int sum = 0;
            temp = n;
            while (temp != 0) {
    
                rem = temp % 10;
                sum = sum + rem * rem* rem;
                temp = temp / 10;
    
            }
            if (n == sum) {
                System.out.println("This is armstrong numbrer");
            } else {
                System.out.println("This is not an a armstrong number");
            }
        }
    
        public static void main(String args[]) {
            Q3 a = new Q3(153);
            a.arm();
    
        }
    
    }
    
        
    
    
    

