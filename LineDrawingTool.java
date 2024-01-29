
public class LineDrawingTool {
    public static void main(String[] args) {
        
        PennDraw.setCanvasSize();
        PennDraw.setPenRadius(0.01);
        PennDraw.enableAnimation(30);

        double xCord=.5;
        double yCord=.5;
        
        while (true) {
            if (PennDraw.mousePressed()){
                PennDraw.line(xCord, yCord, PennDraw.mouseX(), PennDraw.mouseY());
                xCord=PennDraw.mouseX();
                yCord=PennDraw.mouseY();
            }

            // advance the frame after everything has been drawn for this loop
            PennDraw.advance();
        }
    }
}
