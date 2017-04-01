package xml.SpringTutorailSecond;


public class TestEdition {
    private String f;
    private int i;

    public TestEdition(String f, int i) {
        this.f = f;
        this.i = i;
        System.out.println("f is "+ f + ", i is " + i);
    }

    @Override
    public String toString() {
        return "TestEdition{" +
                "f='" + f + '\'' +
                ", i=" + i +
                '}';
    }
}
