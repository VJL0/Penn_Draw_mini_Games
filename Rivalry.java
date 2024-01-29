
public class Rivalry {    
    public static void main(String[] args) {

        //initalizing variables
        boolean rivalOneWins = false;  // has contestant 1 won the race?
        boolean rivalTwoWins = false;  // has contestant 2 won the race?
        double ONE_PIXEL = 1.0 / 512; 
        double carPosition1 = .05;
        double carPosition2 = .05;


        PennDraw.enableAnimation(60);
        while (!rivalOneWins && !rivalTwoWins) {
            PennDraw.clear();
            PennDraw.text(.1, .97, "START");
            PennDraw.text(.9, .97, "FINISH");
            PennDraw.line(.1, 0, .1, .95);
            PennDraw.line(.9, 0, .9, .95);

            // chance of moving is 56%
            if (Math.random() <=.56){
                carPosition1+=ONE_PIXEL;
            }
            // chance of moving is 48%
            if (Math.random() <=.48){
                carPosition2+=ONE_PIXEL;
            }
            // Draw cars
            PennDraw.picture(carPosition1, .3, "fastest_car.png", 56, 0);
            PennDraw.picture(carPosition2, .6, "fast_electric_car.png", 60, 0);

            // if fastest car passes finish line then stop loop
            if (carPosition1 >= .90){
                rivalOneWins = true;
            }
            // if tesla car passes finish line then stop loop
            if (carPosition2 >= .90){
                rivalTwoWins = true;
            }
            
            PennDraw.advance(); 
        }
        PennDraw.disableAnimation(); 

        // Victory messages
        if (rivalOneWins){
            PennDraw.text(.5, .5, "Koenigsegg WINS");
        }
        if (rivalTwoWins){
            PennDraw.text(.5, .5, "Tesla WINS");
        }
    }
}