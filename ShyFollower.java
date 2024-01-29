
public class ShyFollower {

    public static void main(String[] args) {
        PennDraw.setPenColor(PennDraw.BLACK);
        double mouseX, mouseY, dx, dy;
        double ballX = .5;
        double ballY = .5;
        PennDraw.filledCircle(ballX, ballY, .06);

        //enables animation
        PennDraw.enableAnimation(120);
        while (true) {
            PennDraw.clear();

            mouseX = PennDraw.mouseX();
            mouseY = PennDraw.mouseY();
            //calculate distance of x and y axis
            dx = mouseX - ballX;
            dy = mouseY - ballY;
            //update ball XY position 
            ballX += dx*.03;
            ballY += dy*.03;

            PennDraw.filledCircle(ballX, ballY, .06);
            PennDraw.advance(); 
        }
    }
}