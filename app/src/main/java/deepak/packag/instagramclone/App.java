package deepak.packag.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aZ81GMuStScZ9Qu1e03R0aJX6MsjIVYSTuk1jcoI")
                // if defined
                .clientKey("UgUTZZY89uUSILB1qIsPdDsFSGoZDhcCffpJq0Fv")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
