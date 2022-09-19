import java.util.Scanner;

public class Empaaat {
    public static void main(String[] args) {
        int a,x,y;
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukan tinggi segitiga : ");
        a = input.nextInt();
        int[][]b = new int[100][100];
        for(x=1; x<=a; x=x+1){
            for(y=a; y>x; y=y-1){
                System.out.print("   ");
            }
            for(y=1; y<=x; y++){
                if(x==0||y==x){
                    b[x][y]=1;
                    System.out.print("  "+b[x][y]+"   ");
                }
                else{
                    b[x][y] = b[x-1][y-1] + b[x-1][y];
                    if(b[x][y]>99)
                        System.out.print("  "+b[x][y]+" ");
                    else if(b[x][y]>9)
                        System.out.print("  "+b[x][y]+"  ");
                    else
                        System.out.print("  "+b[x][y]+"   ");
                }
            }
            System.out.println();
        }
    }
}