package mediaaritmetica;


public class MediaAritmetica {

    public static void main(String[] args) {
         int[] nums = new int [6];
         nums[0] = 7;
         nums[1] = 8;
         nums[2] = 9;
         nums[3] = 4;
         nums[4] = 5;
         nums[5] = 6;
        
         int media1 = nums[0] + nums[1] + nums[2];
         int media2 = nums[3] + nums[4] + nums[5];
         
         media1 = media1/3;
         media2 = media2/3;
         
         int mediaTotal = media1 + media2;
         float total = (float)mediaTotal / 2;
         
         System.out.println("A primeira média é >: " + media1);
         System.out.println("A segunda média é >: " + media2);
         System.out.println("A soma entre as duas médias é >: " + mediaTotal);
         System.out.println("A segunda média total é >: " + total);
    }
    
}
