package Service;

import java.sql.SQLException;

/**
 * Created by usman on 09/11/2017.
 */
public class AspectService {

    @TryAgain(classTab = {SQLException.class})
    public void tryAgainMethod() throws Exception{
        System.out.print("toto");
    }
}
