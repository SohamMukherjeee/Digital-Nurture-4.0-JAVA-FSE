public class Test {
    public static void main(String[] args) {
        Shop newShop= new Shop();
        long startTime,endTime;
        int productId = 0;
        newShop.storePdt();
        long BinarySearchTime=0,LinearSearchTime=0;
        System.out.println("------------------------------------------------------------");
        System.out.println("Binary Search");
        startTime=System.nanoTime();
        newShop.binarySearch(5);
        endTime=System.nanoTime();
        newShop.result(productId);
        BinarySearchTime=endTime-startTime;
        System.out.println("Time taken to search : " +BinarySearchTime);

        System.out.println("------------------------------------------------------------");
        System.out.println("Linear Search");
        startTime=System.nanoTime();
        newShop.linearSearch(5);
        endTime=System.nanoTime();
        newShop.result(productId);
        LinearSearchTime=endTime-startTime;
        System.out.println("Time taken to search : " +LinearSearchTime);

    System.out.println("----------------------------Conclusion--------------------------");

        if (LinearSearchTime>BinarySearchTime) {
            System.out.println("Binary search is more Faster");
        }else{
            System.out.println("Linear serach is more faster");
        }

    }
}

