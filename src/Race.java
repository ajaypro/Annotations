import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Ajay on 05-06-2019.
 */

@Target(ElementType.METHOD) // Race annotation targeted only for methods
@Retention(RetentionPolicy.RUNTIME) // Retained by VM during runtime
@interface Race { // Race annotation defined by @

    String model();
    int lapsCompleted();
}
