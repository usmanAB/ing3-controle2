package Service;

import java.lang.annotation.*;
import java.sql.SQLException;

/**
 * Created by usman on 09/11/2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TryAgain {
    Class[] classTab() default Throwable.class;
}
