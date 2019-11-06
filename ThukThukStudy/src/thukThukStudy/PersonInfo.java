package thukThukStudy;

public class PersonInfo {
	private String name;
    private int age;
    private String favoriteColor;
    private String favoriteAnimal;
    private int favoriteNumber;

    public PersonInfo(String name, int age, String favoriteColor, String favoriteAnimal, int favoriteNumber){
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.favoriteAnimal = favoriteAnimal;
        this.favoriteNumber = favoriteNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }

    public String getPersonInfo(){
        String personInfo = String.format("name:%s, age:%d, favoriteColor:%s, favoriteAnimal:%s, favoriteNumber:%d"
                , name, age, favoriteColor, favoriteAnimal, favoriteNumber);
        return personInfo;
    }
}

