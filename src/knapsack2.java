import java.util.*;


class Pair
{
    int weight;
    int value;
    Pair(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public
    String toString(){
        return this.weight + " " + this.value;
    }

}
        



public class knapsack2 {
    public static void main(String[] args) {
       Pair[] p = new Pair[6];
        p[0] = new Pair(40,50);
        p[1] = new Pair(50,40);
        p[2] = new Pair(25,90);
        p[3] = new Pair(100,120);
        p[4] = new Pair(30,10);
        p[5] = new Pair(45,200);

        System.out.println(maximumValue(p,6,200));





    }
    public  static double maximumValue(Pair[] items, int n, int w) {
        // Write your code here.
        // ITEMS contains {weight, value} pairs.
        Arrays.sort(items,new Comparator<Pair>(){
            public int compare(Pair o1,Pair o2){
                double d1 = (double)(o2.value/o2.weight);
                double d2 = (double)(o1.value/o1.weight);
                if(d1 > d2) return  1;
                else if (d1 < d2) return -1;
                else return 0;


            }
        });


        double remWeight = w;
        double maxValue = 0;
        for(int i =0;i< n ;i++){
            if(items[i].weight < remWeight){
                maxValue += items[i].value;
                remWeight -= items[i].weight;

            }
            else{
                double d =   (items[i].value/items[i].weight)*(remWeight);
                maxValue += d ;
                return maxValue;
            }
        }
        return maxValue;
    }
}