package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User tomek = new User();
        tomek.setUserName("Tomekdf");
        tomek.setPassword("haslo12df3");
        tomek.setEmail("tofdfek@waw.pl");
        UserDao tomekDao = new UserDao();
        User read = tomekDao.read(1);
        System.out.println(read);
        read.setUserName("Nowy");
        read.setPassword("nowyyy");
        tomekDao.findAll();
        User[] tab = tomekDao.findAll();
        for (User u : tab) {
            System.out.println(u);
        }

    }
}
