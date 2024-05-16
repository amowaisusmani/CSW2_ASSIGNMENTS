import java.util.*;

class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo=" + plotNo +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

public class Q07 {
    public static void main(String[] args) {
        TreeMap<String, Address> treeMap = new TreeMap<>();

        treeMap.put("John", new Address(1, "Street 1", "City 1"));
        treeMap.put("Jane", new Address(2, "Street 2", "City 2"));
        treeMap.put("Bob", new Address(3, "Street 3", "City 3"));

        Iterator<Map.Entry<String, Address>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}
