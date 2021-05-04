// Solution 1

 public static String angryProfessor(int k, List<Integer> a) {
    int count=0;
    String result;
   for(int i=0;i<a.size();i++) {
       if(a.get(i)<=0) {
                count++;  
            }
        }
        if(count>=k) {
            result= "NO";
        }
        else {
            result= "YES";
        }
        return  result;
 }

//Solution 2 //efficient way

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int onTimeStudents = 0;
            int N = scan.nextInt();
            int K = scan.nextInt();
            for (int i = 0; i < N; i++) {
                if (scan.nextInt() <= 0) {
                    onTimeStudents++;
                }
            }
            System.out.println(onTimeStudents < K ? "YES" : "NO");
        }
        scan.close();
    }
}


    
