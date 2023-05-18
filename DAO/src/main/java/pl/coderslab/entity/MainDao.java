package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User tomek = new User();
        tomek.setUserName("Tomek");
        tomek.setPassword("haslo123");
        tomek.setEmail("toek@waw.pl");
        UserDao tomekDao = new UserDao();
        tomekDao.create(tomek);
    }
}
