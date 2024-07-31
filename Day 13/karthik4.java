class Mul {

    void dis(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a + " x " + i + " = " + i * a);
        }
    }
}

class karthik4 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table: ");
        Mul ob = new Mul();
        ob.dis(11, 10);
	System.out.println();
        ob.dis(13, 10);
    }
}