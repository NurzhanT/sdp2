class House {
    private String walls;
    private String roof;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void show() {
        System.out.println("House with " + walls + " walls and " + roof + " roof.");
    }
}

class HouseBuilder {
    private House house = new House();

    public HouseBuilder buildWalls(String walls) {
        house.setWalls(walls);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public House build() {
        return house;
    }

    public static void main(String[] args) {
        House house = new HouseBuilder().buildWalls("brick").buildRoof("tile").build();
        house.show();
    }
}
