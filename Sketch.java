import processing.core.PApplet;

public class Sketch extends PApplet {
	
    public void settings() {
        // Size Call
        size(1200, 600);
    }

    public void setup() {
        // Set Background Colour
        background(45, 150, 207);
    }

    public void draw() {
        draw_section_outlines();
        draw_section1();
        draw_section2();
        draw_section3();
        draw_section4();
        
        draw_section5();
        draw_section6();
        draw_section7();
        draw_section8();
    }

    public void draw_section_outlines(){
        stroke(0);
        noFill();

        // Draw bottom row boxes
        rect(0,300, 300, 300);
        rect(300, 300, 300, 300);
        rect(600, 300, 300, 300);
        rect(900, 300, 300, 300);

        // Draw top row boxes
        rect(0,0, 300, 300);
        rect(300, 0, 300, 300);
        rect(600, 0, 300, 300);
        rect(900, 0, 300, 300);
    }
    
    //Draw Section 1
    public void draw_section1(){
        int intX = 0;
        int intY = 0;

        // Draw 30 x 30 grid of white squares
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn < 30; intColumn++){
                intX = 3 + intColumn * 10;  
                intY = 300 + 3 + intRow * 10; 

                fill(255);
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }
    }

    // Draw Section 2
    public void draw_section2(){
        int intX = 0;
        int intY = 0;

        // Draw 30 x 30 Grid of Squares Where Black and White Columns Alternate
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn < 30; intColumn++){
                intX = 300 + 3 + intColumn * 10;  
                intY = 300 + 3 + intRow * 10; 

                if (intColumn % 2 == 1){
                    fill(0);
                }
                else {
                    fill(255);
                }
                
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }

    // Draw Section 3
    public void draw_section3(){
        int intX = 0;
        int intY = 0;

        // Draw 30 x 30 Grid of Squares Where Black and White Rows Alternate
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn < 30; intColumn++){
                intX = 600 + 3 + intColumn * 10;  
                intY = 300 + 3 + intRow * 10; 

                if (intRow % 2 == 0) {
                    fill(0);
                }
                else {
                    fill(255);
                }
                
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }

    // Draw Section 4
    public void draw_section4(){
        int intX = 0;
        int intY = 0;

        // Draw 30 x 30 Grid of Squares where a black row and an alternating black and white row alternate
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn < 30; intColumn++){
                intX = 900 + 3 + intColumn * 10;  
                intY = 300 + 3 + intRow * 10; 

                if (intRow % 2 == 0 || intColumn % 2 == 1) {
                    fill(0);
                }
                else {
                    fill(255);
                }
                
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }

    // Draw Section 5
    public void draw_section5(){
        int intX = 0;
        int intY = 0;

        // Create Condition where number of squares start at 0 and increase by 1 each row onwards aligned to the right
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 30 - intRow; intColumn < 30; intColumn++){
                intX = 3 + intColumn * 10;  
                intY = 3 + intRow * 10; 
                fill(255);
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }

    public void draw_section6(){
        int intX = 0;
        int intY = 0;

        // Create Condition where number of squares start at 1 and increase by 1 each row onwards aligned to the left
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn <= intRow; intColumn++){
                intX = 300 + 3 + intColumn * 10;  
                intY = 3 + intRow * 10; 

                fill(255);
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }

    public void draw_section7(){
        int intX = 0;
        int intY = 0;

        // Create Condition where number of squares start at 30 and decrease by 1 each row onwards aligned to the left
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = 0; intColumn < 30 - intRow; intColumn++){
                intX = 600 + 3 + intColumn * 10; 
                intY = 3 + intRow * 10; 

                fill(255);
                noStroke();
                rect(intX, intY, 5, 5);

            }
        }

    }
    
    public void draw_section8(){
        int intX = 0;
        int intY = 0;

        // Create Condition where number of squares start at 30 and decrease by 1 each row onwards aligned to the right
        for(int intRow = 0; intRow < 30; intRow++){
            for(int intColumn = intRow; intColumn < 30; intColumn++){
                intX = 900 + 3 + intColumn * 10; 
                intY = 3 + intRow * 10;

                fill(255);
                noStroke();
                rect(intX, intY, 5, 5);

          }
        }

    }

}
