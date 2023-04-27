class outer{
    int x = 1;
    static class inner{
        int y = 2;
    }
}


public class test {
    public static void main(String[] args) {
        outer out = new outer();
        outer.inner in = new outer.inner();
        System.out.println(out.x + " " + in.y);
    }
}
