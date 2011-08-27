//super basic template!!
//check the API for information about the methods implemented!!
//thanks to panos kountanis
import com.cycling74.max.*;
import com.cycling74.jitter.*;
import java.util.Random;

public class AnaMaria extends MaxObject{
    Random rr;
    //matrix to draw
    JitterMatrix jjm;
    
    //constructor 
    public AnaMaria(){
        declareIO(1,1);
        jjm=new JitterMatrix("ana",1,"char",10,10);
        this.rr=new Random();
    }
    
    //messages
    public void hello(){
        post("i like java and jitter");
    }
    
    //when you get a bang from the max patcher…
    public void bang(){
        this.vectorial();
        outlet(0,"jit_matrix",jjm.getName());
    }
    
    //a simple method to draw geometries
    private void vectorial(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                jjm.setcell(new int[]{i,j},0,this.rr.nextInt(254));
            }
        }
    }
    

}