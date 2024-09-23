package LeedCode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{0,0,1,0,0};
        int n = 1;
        boolean value = CanPlaceFlowers(flowerbed,n);
        System.out.println(value);
    }
    public static boolean CanPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if(AnySpaceAvailable(flowerbed,i)){
                flowerbed[i] = FlowerSpace.FILLED.value;
                n--;
            }
            if(n<=0){
                return true;
            }
        }
        return false;
    }
    private static boolean AnySpaceAvailable(int[] flowerbed, int index) {
        if(index == 0){
            return HandleStartEle(flowerbed, index);
        } else if (index==flowerbed.length-1) {
            return HandleEndEle(flowerbed, index);
        }
        else{
            return HandleMiddleEle(flowerbed, index);
        }
    }
    private static boolean HandleMiddleEle(int[] flowerbed, int index) {
        return flowerbed[index + 1] == FlowerSpace.EMPTY.value &&
                flowerbed[index - 1] == FlowerSpace.EMPTY.value &&
                flowerbed[index] == FlowerSpace.EMPTY.value;
    }
    private static boolean HandleEndEle(int[] flowerbed, int index) {
        return flowerbed[index - 1] == FlowerSpace.EMPTY.value &&
                flowerbed[index] == FlowerSpace.EMPTY.value;
    }
    private static boolean HandleStartEle(int[] flowerbed, int index) {
        if(flowerbed.length> index +1){
            return flowerbed[index + 1] == FlowerSpace.EMPTY.value &&
                    flowerbed[index] == FlowerSpace.EMPTY.value;
        }
        else{
            return flowerbed[index] == FlowerSpace.EMPTY.value;
        }
    }
    private enum FlowerSpace {
        EMPTY(0),
        FILLED(1);
        FlowerSpace(int value) {
            this.value = value;
        }
        private final int value;
    }

}
