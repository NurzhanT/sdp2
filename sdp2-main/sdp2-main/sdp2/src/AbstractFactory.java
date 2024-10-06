class Chair {
    void sitOn() {
        System.out.println("Sitting on a chair.");
    }
}

class Table {
    void placeItems() {
        System.out.println("Placing items on a table.");
    }
}

class ModernFurnitureFactory {
    public Chair createChair() {
        return new Chair();
    }

    public Table createTable() {
        return new Table();
    }

    public static void main(String[] args) {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        chair.sitOn();
        table.placeItems();
    }
}
