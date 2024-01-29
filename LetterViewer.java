
public class LetterViewer {
    public static void main(String[] args) {
        // Adding Canvas
        PennDraw.setCanvasSize();
        // set the font size
        PennDraw.setFontSize(64);        
        // turn on animation
        PennDraw.enableAnimation(30);

        while (true) {
            // If key typed then clear canvas and print the key pressed
            if (PennDraw.hasNextKeyTyped()) {
                PennDraw.clear();
                PennDraw.text(.5, .5, ""+PennDraw.nextKeyTyped()); 
            }
            //Move to next frame
            PennDraw.advance();
        }
    }
}