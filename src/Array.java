public class Array {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int max(int[]array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
        public int min(int[]array1) {
            int min = array[0];
            for (int i = 0; i < array1.length; i++) {
                if (array1.length < min) {
             min = array1[i];
                }
            }
            return  min;
        }

        public int pow(int a, int b){
         int result = 1;
            for (int i = 0; i <= b; i++) {
                result*=a;
            }
        return result;
        }
    }


