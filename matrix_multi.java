import java.util.*; 
public class matrix_multi { 
public static void main(String[] args) { 
multiplication m = new multiplication(); 
m.product(); 
} 
} 
class multiplication{ 
int r1,c1,r2,c2,i,j,k; 
int a[][]; 
int b[][];  
int p[][]; 
Scanner sc = new Scanner(System.in); 
void input() { 
System.out.println("Enter the no of rows of the first matrix"); r1 = sc.nextInt(); 
System.out.println("Enter the no of columns of the first matrix"); c1 = sc.nextInt(); 
System.out.println("Enter the no of rows of the second matrix"); r2 = sc.nextInt(); 
System.out.println("Enter the no of columns of the second matrix"); c2 = sc.nextInt(); 
a = new int[r1][c1]; 
b = new int[r2][c2];
p = new int[r1][c2]; 
System.out.println("Enter the elements of the first matrix: "); for(i=0;i<r1;i++) { 
for(j=0;j<c1;j++) { 
a[i][j] = sc.nextInt(); 
} 
} 
System.out.println("Enter the elements of the second matrix: "); for(i=0;i<r2;i++) { 
for(j=0;j<c2;j++) { 
b[i][j] = sc.nextInt(); 
} 
} 
} 
void product() { 
input(); 
if(c1==r2) { 
for(i=0;i<r1;i++) { 
for(j=0;j<c2;j++) { 
p[i][j] = 0; 
for(k=0;k<r2;k++) { 
p[i][j] += (a[i][k]*b[k][j]); 
} 
} 
} 
System.out.println("The sum matrix is:"); 
for(i=0;i<r1;i++) { 
for(j=0;j<c2;j++) { 
System.out.print(p[i][j]+" "); 
} 
System.out.println(); 
} 
} 
else System.out.println("The two matrix can't be multiplied"); } 
}
