/**
 * @Author Ajay on 05-06-2019.
 */
public class Car {

    @Race(model = "Mclaren", lapsCompleted = 6)
    public void formulaOne(){
       System.out.println("Not completed");
    }
    @Race(model = "Ferrari", lapsCompleted = 10)
    public void formulaTwo(){
        System.out.println(" completed");

    }
}
