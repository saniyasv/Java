import java.util.Scanner;
class MatrixMulti{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int i=0;
int j=0;
System.out.println("enter the no.of rows");
int row1=sc.nextInt();
System.out.println("enter the no.of cols");
int col1=sc.nextInt();
int[][] matrix1=new int[row1][col1];
System.out.println("enter the no.of rows");
int row2=sc.nextInt();
System.out.println("enter the no.of cols");
int col2=sc.nextInt();
int[][] matrix2=new int[row2][col2];

if(row1!=col1)
{
System.out.println("matrix multiplication is not possible");
}
else
{
System.out.println("enter the elements for matrix1");
for(i=0;i<row1;i++){
for(j=0;j<col1;j++){
matrix1[i][j]=sc.nextInt();
}}
for(i=0;i<row1;i++)
{
for(j=0;j<col1;j++)
{
System.out.print(matrix1[i][j]+" ");}
System.out.println();
}
System.out.println("enter the elements for matrix2");
for(i=0;i<row2;i++)
{
for(j=0;j<col2;j++)
{
matrix2[i][j]=sc.nextInt();
}}
for(i=0;i<row2;i++)
{
for(j=0;j<col2;j++)
{
System.out.print(matrix2[i][j]+" ");}
System.out.println();
}}
int[][] result=new int[row1][col2];
for(i=0;i<row1;i++)
{
for(j=0;j<col2;j++)
{
result[i][j]=0;
for(int k=0;k<row2;k++)
{
result[i][j]+=matrix1[i][k]*matrix2[k][j];
}
}
}
System.out.println("the multiplication is:");
for(i=0;i<row1;i++)
{
for(j=0;j<col2;j++)
{
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
}



















