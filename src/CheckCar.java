import java.lang.reflect.Method;

/**
 * @Author Ajay on 05-06-2019.
 */
public class CheckCar {

    public static void main(String[] args) {


        Class checkMethod = Car.class;

        for (Method method : checkMethod.getMethods()) {
            Race raceAnnotation = method.getAnnotation(Race.class);

            if (raceAnnotation != null) {
                System.out.println("Method name with Race annoation : " + method.getName());
                System.out.println("Car Model : " + raceAnnotation.model());
                System.out.println(raceAnnotation.model() + " completed laps " + raceAnnotation.lapsCompleted());
            }
        }


    }
}
