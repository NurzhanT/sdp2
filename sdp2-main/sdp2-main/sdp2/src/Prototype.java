class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public Shape clone() {
        return new Shape(this.type);
    }

    public void showType() {
        System.out.println("This is a " + type);
    }

    public static void main(String[] args) {
        Shape original = new Shape("Circle");
        Shape clone = original.clone();
        clone.showType();
    }
}
