public class ar {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int n = sc.nextInt();

        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++) {

           for(int j=0;j<n;j++) {

               arr[i][j]=sc.nextInt();

          }
          
        }

        for(int i=0;i<m;i++) {

            int sum = 0;

            for(int j=0;j<n;j++) {

                sum+=arr[i][j];

                }

            System.out.println("Sum of the row "+i+" = "+sum);

            }

        sc.close();

        }

	}