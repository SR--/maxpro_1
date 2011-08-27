//Equivalent of the following Processing sketch in MAX
//
//void setup(){
//size(800, 600);
//}
//
//void draw(){
//background(0);
//
//stroke(255);
//line(width *0.5f, height *0.5f, mouseX, mouseY);
//}

import com.cycling74.max.*;
import com.cycling74.jitter.*;

public class Lesson2 extends MaxObject{

JitterMatrix l2= new JitterMatrix(3,"float32",2);
int[] cells = new int[2];
float x, y;

public Lesson2(){
declareInlets(new int[]{DataTypes.ALL});
declareOutlets(new int[]{DataTypes.ALL});
x = 0; y = 0;
cells[0]=0; cells[1] = 0;
}

public void setX(float _x){
x = _x;
}

public void setY(float _y){
y = _y;
}

public void resetValues(){
x = 0;
y = 0;
}

public void bang(){
int plane = 0;
l2.setcell(cells, plane, x);

plane = 1;
l2.setcell(cells, plane, y);

plane = 2;
l2.setcell(cells, plane, 0.0f);

outlet(0,"jit_matrix", l2.getName());
}

}