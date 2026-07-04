public class arrayss{
    public static void main(String[] args){

        //we are learning arrays right now
        String[] cars = {"Mercedes","BMW","Audi","Ford","Tata","Hyundai"};
        System.out.println("Specific element output: ");
        System.out.println(cars[0]);
        System.out.print(cars[3]);
        System.out.println("\n");
        int[] num = {10,20,30,40,50};
    
        System.out.println(num.length);
        
            for(int numbers :num){
                System.out.println(numbers);
            }

        System.out.println("\nEditing values in arrays- ");
        cars[1]="Bayerische Motoren Werke Aktiengesellschaft";
            
            for(int i=0;i<cars.length;i++){
                System.out.println(cars[i]+"");
            }

        System.out.println("\nCheck length of array- ");
        System.out.println(cars.length);

        String[] alphabets = new String[5];

        alphabets[0] = "a";
        alphabets[1] = "b";
        alphabets[2] = "c";
        alphabets[3] = "d";
        alphabets[4] = "e";

        System.out.println(alphabets[1]);
        System.out.println("\n");

        System.out.println("Let's practice loops in array in more depth. \n");
        String[] animals={"lion","tiger","elephant","giraffe","hippopotamous"};

        for(int a=0; a<animals.length;a++){
            System.out.println(animals[a]);
        }

        System.out.println("\nLets try to run a different variable array now.");
        float[] decimals={1.2f,2.3f,3.4f,4.5f};

        for(int j=0;j<decimals.length;j++){
            System.out.println(decimals[j]);
        }

        System.out.println("\nLets print sum of elements in array");
        int[] addelements = {11,34,91,18,4,-66};
        int sum = 0;

        for(int s=0;s<addelements.length;s++){
            sum += addelements[s];
            
        }
        System.out.println("Sum = "+sum);
        //If you print sum inside loop then each iteration will be printed.
        //If you print sum outside loop then the total sum will be printed.

        System.out.println("\nLets just put a for loop to practice.");

        String[] bikes={"Royal Enfield","BMW","Honda","Bajaj","Suzuki"};

        for(int b=0;b<bikes.length;b++){
            System.out.println("Bike number "+b+" is associated to team "+bikes[b]);
        }

        System.out.println("\n");
        //program to check average of ages present in a collection

        int[] ages={12,42,66,32,40,93,55,69,20,11};
        float summ=0f;
        float avg=0f;

        for(int age : ages){
            System.out.println(age);
            summ = summ + age;
            
        }
        System.out.println("\nTotal sum is"+summ);
        avg = summ/ages.length;

        System.out.println("The average of these total values are "+avg);

        
    }
}