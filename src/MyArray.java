public class MyArray {
    private int[] array;
    public MyArray(int[] array) {
        this.array = array;
    }
    public int iterativeLinearSearch(int target) {
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public int recursiveLinearSearch(int target) {
    int i = 0;

        return revcur(target,i);
    }
    public int revcur(int target, int i){
        if(i>=array.length){
            return -1;
        }else{
            if(array[i] == target){
                return i;
            }
        }
        return revcur(target,++i);
    }

    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7,8};
        MyArray s = new MyArray(array);
        int target = 3;
        System.out.println(s.recursiveLinearSearch(target));
        System.out.println(s.iterativeBinarySearch(6));
        System.out.println(s.recursiveBinarySearch(3));
    }
    public int iterativeBinarySearch(int target) {
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(array[mid]==target ){
                return mid;
            }else if(array[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return left;
    }
    public int recursiveBinarySearch(int target) {
int low = 0;
int high = array.length-1;
        return recursiveBinarySearch(array,target,low,high);
    }
    public int recursiveBinarySearch(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1; // Phần tử không tồn tại trong mảng.
        }

        int mid = (low + high) / 2;

        if (array[mid] == target) {
            return mid; // Phần tử được tìm thấy tại vị trí mid.
        } else if (array[mid] > target) {
            return recursiveBinarySearch(array, target, low, mid - 1); // Tìm kiếm trong nửa bên trái của mảng.
        } else {
            return recursiveBinarySearch(array, target, mid + 1, high); // Tìm kiếm trong nửa bên phải của mảng.
        }
    }
}
