
interface Product {
    void use();
}


class ProductA implements Product {
    public void use() {
        System.out.println("Using Product A");
    }
}

class ProductB implements Product {
    public void use() {
        System.out.println("Using Product B");
    }
}


class ProductFactory {
    public Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product1 = factory.createProduct("A");
        product1.use(); // Output: Using Product A

        Product product2 = factory.createProduct("B");
        product2.use(); // Output: Using Product B
    }
}
