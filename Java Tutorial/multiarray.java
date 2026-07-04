public class multiarray{
    public static void main(String[] args){

        System.out.println("Let's learn Multi Dimensional Array");

        int[][] mynumbers = {{1,4,2},{3,6,8}};
        System.out.println(mynumbers[0][0]);

        System.out.println("\nEditing Element Values");
        mynumbers[0][0]=9;
        System.out.println("\n"+mynumbers[0][0]);

        System.out.println("Now getting the length as output.");
        System.out.println("Length of Rows: "+mynumbers.length);
        System.out.println("Length of columns 1: "+mynumbers[0].length);
        System.out.println("Length of column 2: "+mynumbers[1].length);

        System.out.println("next is Loop through a multidimensional array.");
        int[][] num = {{3,2,8},{9,4,1,6,8}};
        for(int row= 0;row<num.length;row++){
            for(int col= 0;col<num[row].length;col++){
                System.out.println("num["+row+"]["+col+"]="+num[row][col]);
            }
        }

        System.out.println("\nLets just do another one because I feel like I copied it.\n");
        int[][] randomnums ={{8,3,1,5},{9,1,2,8,3,0}};
        for(int randomrow=0;randomrow<randomnums.length;randomrow++){
            for(int randomcol=0;randomcol<randomnums[randomrow].length;randomcol++){
                System.out.println("Numbers["+randomrow+"]["+randomcol+"]="+randomnums[randomrow][randomcol]);
            }
        }
        
        System.out.println("\nRevision time\n");
        int[][] revnum={{1,2,3,4},{5,6,7,8,9,0}};
        for(int revrow=0;revrow<revnum.length;revrow++){
            for(int revcol=0;revcol<revnum[revrow].length;revcol++){
                System.out.println("Numbers["+revrow+"]["+revcol+"]="+revnum[revrow][revcol]);
            }
        }

        System.out.println("\nLets do it again for a one last time for today atleast.\n");
        int[][] lastnum={{9,2,3,6,1},{3,4,1,7,8,2,4}};
        for(int lastrow=0;lastrow<lastnum.length;lastrow++){
            for(int lastcol=0;lastcol<lastnum[lastrow].length;lastcol++){
                System.out.println("Number=["+lastrow+"]["+lastcol+"]="+lastnum[lastrow][lastcol]);
            }
        }
    }
}