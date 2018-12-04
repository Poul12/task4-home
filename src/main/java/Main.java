import api.HomeLoader;
import models.Home;
import service.HomeLoaderImpl;

public class Main
{
    public static void main(String[] args)
    {
        HomeLoader loader = new HomeLoaderImpl();

        Home home = loader.loadHome("home.home", "%");

        System.out.println("home: " + home);

    }
}
