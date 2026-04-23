public class DistanceTest {
    int m, cm;

    DistanceTest(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }

    DistanceTest add(DistanceTest d) {
        int cm = this.cm + d.cm;
        int m = this.m + d.m + cm / 100;

        cm = cm % 100;

        return new DistanceTest(m, cm);
    }

    void display() {
        System.out.println(m + "m " + cm + "cm");
    }

    public static void main(String[] args) {
        DistanceTest d1 = new DistanceTest(2, 80);
        DistanceTest d2 = new DistanceTest(3, 50);

        DistanceTest result = d1.add(d2);
        result.display();
    }
}