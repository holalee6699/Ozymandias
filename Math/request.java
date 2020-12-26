public class request {
    public static void main(String[] args) {
        int o = 1;
        int p = 2;
        int[] q = {1,2,3};
        for(int i = 0;i<q.length;i++){
            o++;
            p++;
            System.out.println(p+o+q[i]);
        }
    }
}
