
public class WanderingEye {
    //function to draw the pupil
    public static void drawPupil(double x1, double y1, double bounds, double pupilRadius){
        double x2, y2, angle, mouseX, mouseY;
        //math for eye to track the mouse  
        mouseX = PennDraw.mouseX();
        mouseY = PennDraw.mouseY();
        angle = Math.atan2(mouseY - y1, mouseX - x1);
        x2 = x1 + bounds * Math.cos(angle);
        y2 = y1 + bounds * Math.sin(angle);
        //draws the pupil
        PennDraw.filledCircle(x2, y2, pupilRadius);
    }

    public static void drawPupilV2(double x1, double y1, double bounds, double pupilRadius){
        double mouseX, mouseY, dx, dy;
        //gets the distance between mouse and pupil for x-Axis and y-Axis
        mouseX = PennDraw.mouseX();
        mouseY = PennDraw.mouseY();
        dx = mouseX - x1;
        dy = mouseY - y1;

        PennDraw.filledCircle(x1 + dx*bounds, y1 + dy*bounds, pupilRadius);
        
    }

    public static void main(String[] args) {
        //enables animation
        PennDraw.enableAnimation(60);

/*        // COMPLICATED WAY
        while (true) {
            //background 
            PennDraw.clear(251, 229, 228);
            PennDraw.picture(.5, .56, "eye.png", 0, 400);
            //draws the pupil
            PennDraw.setPenColor(PennDraw.BLACK);
            drawPupil(.5, .5, .06, .06);
            PennDraw.setPenColor(PennDraw.WHITE);
            drawPupil(.5, .5, .08, .02);
            //next frame
            PennDraw.advance(); 
        }
/*
/**/      //  EASY WAY
        while (true) {
            //background
            PennDraw.clear(251, 229, 228);
            PennDraw.picture(.5, .56, "eye.png", 0, 400);
            //draws the pupil
            PennDraw.setPenColor(PennDraw.BLACK);
            drawPupilV2(.5, .5, .1, .06);
            PennDraw.setPenColor(PennDraw.WHITE);
            drawPupilV2(.5, .5, .15, .02);
            //next frame
            PennDraw.advance(); 
        }

/**/


    }
}