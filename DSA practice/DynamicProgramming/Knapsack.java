import java.util.Arrays;

class Knapsack{

    public static int [][]t = new int[5][8];
    public static void main(String[] args) {
        System.out.print("Hello, Welcome to knapsack tutorial!");
        int []w = new int[]{1,3,4,5};
        int []v = new int[]{1,4,5,7};
        int W = 7;

        int maxValue = Knapsack.maxValKSRecurse(w,v,W,w.length);
        System.out.println("Max Value :- "+ maxValue);

        for (int []i : t) {
            Arrays.fill(i, -1);
        }
        maxValue = Knapsack.maxValKSMemoize(w,v,W,w.length);
        System.out.println("Max Value using Memoize:- "+ maxValue);
    }

    /**
     * Returns max value, using 0-1 ks recursively
     * @param w weight arr
     * @param v value arr
     * @param W Max weight capacity
     * @param n No of items
     */
    public static int maxValKSRecurse(int w[], int v[], int W, int n){
        //base condition
        if(W == 0 || n == 0){
            return 0;
        }

        //choice section
        int currentWeight = w[n-1];
        int currentValue = v[n-1];
        if(currentWeight <= W){
            return Math.max(
                currentValue + maxValKSRecurse(w, v, W - currentWeight, n-1), //include
                maxValKSRecurse(w, v, W, n-1)); //dont
        }
        else{
            return maxValKSRecurse(w, v, W, n-1); //dont
        }
    }

    public static int maxValKSMemoize(int w[], int v[], int W, int n){
        //base condition
        if(W == 0 || n == 0){
            return 0;
        }

        if(t[n][W] != -1){
            return t[n][W];
        }
        //choice section
        int currentWeight = w[n-1];
        int currentValue = v[n-1];

        if(currentWeight <= W){
            return t[n][W] = Math.max(
                currentValue + maxValKSMemoize(w, v, W - currentWeight, n-1), //include
                maxValKSMemoize(w, v, W, n-1)); //dont
        }
        else{
            return t[n][W] = maxValKSMemoize(w, v, W, n-1); //dont
        }
    }

}
