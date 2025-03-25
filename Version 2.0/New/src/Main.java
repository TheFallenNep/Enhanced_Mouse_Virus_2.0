import java.awt.*;


public class Main {


    public static void main(String[] args) throws AWTException {


        int [] my_array_x = {100,289,700,300,239,70,0,190,600,70,90};
        int [] my_array_y = {290,180,400,700,222,39,0,230,900,80,70};


            Robot r = new Robot();



            for(int x:my_array_x){
                for(int y:my_array_y){

                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(100);
                    r.mouseMove(x, y);
                    r.delay(10);
                    r.mouseMove(x, y);
                    r.delay(1000);
                    r.mouseMove(x, y);
                    r.delay(1);



                }
            }

        while(true){
            r.mouseMove(0,0);
        }
    }
}
