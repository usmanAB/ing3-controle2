package Application;

import Service.AspectService;
import Service.TryAgain;

/**
 * Created by usman on 09/11/2017.
 */
public class TryAgainAspect {

    private AspectService aspectService;


    public void executeTryAgainMethod(){


        try {
            aspectService.tryAgainMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
