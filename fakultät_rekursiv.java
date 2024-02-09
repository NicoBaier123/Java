public class fakultät_rekursiv {
    public static void main(String[] args) {
        System.out.println(fakultät(5));
    }
    public static int fakultät(int n){
        if (n<=0) return 1;
        return fakultät(n-1)*n;
        //(fakultät von 4)*5
    }
}
