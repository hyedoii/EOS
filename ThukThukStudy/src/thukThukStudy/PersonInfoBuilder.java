package thukThukStudy;

public class PersonInfoBuilder {
	private String name;
    private int age;
    private String favoriteColor;
    private String favoriteAnimal;
    private int favoriteNumber;

    public PersonInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonInfoBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonInfoBuilder setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
        return this;
    }

    public PersonInfoBuilder setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
        return this;
    }

    public PersonInfoBuilder setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
        return this;
    }

    public PersonInfo build(){
        PersonInfo personInfo = new PersonInfo(name, age, favoriteColor, favoriteAnimal, favoriteNumber);
        return personInfo;
    }
}
