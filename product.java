class Product {
    private String pname, pcode;
    private int price;

    public Product() {}

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price + "\n");
    }
}

 class Cars {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setPcode("Car123");
        p1.setPname("Benz");
        p1.setPrice(10000);

        System.out.println("Displaying p1:");
        p1.display();

        Product p2 = new Product("Jaguar", "Car426", 25000);
        System.out.println("Displaying p2:");
        p2.display();

        Product p3 = new Product("Maruthi", "CarBee", 50000);
        System.out.println("Displaying p3:");
        p3.display();

        Product p = (p3.getPrice() < 
                    (p1.getPrice() < p2.getPrice() ? p1.getPrice() : p2.getPrice()))
                    ? p3
                    : (p1.getPrice() < p2.getPrice() ? p1 : p2);

        System.out.println("Displaying product with lowest price:");
        p.display();
    }
}
