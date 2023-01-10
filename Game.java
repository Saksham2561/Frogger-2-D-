package GameLogic;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Game{
//    Instance variables
    private Frog player;
    private ArrayList<Car> Cars ;

//    Constructor

    /**
     *
     * @param name
     * @param startPos
     */

    public Game(String name,Point startPos){
        Cars=new ArrayList<Car>();

         player = new Frog(name,startPos);//Giving name and starting position to the player

        Color col1=new Color(0,0,0);//black
        Color col2=new Color(0,0,255);//blue




        Point p1=new Point(100,400);
        Point p2=new Point(0,300);
        Point p3=new Point(100,150);
        Point p4=new Point(0,80);


// Adding cars to the constructor with the help of Point and Color class from java and Car class used in this assignment

        Car car1=new Car(p1,col1,10,120,75,false);
        Car car2=new Car(p2,col2,30,200,75,false);
        Car car3=new Car(p3,col1,10,120,75,true);
        Car car4=new Car(p4,col1,20,120,75,true);


        Cars.add(car1);
        Cars.add(car2);
        Cars.add(car3);
        Cars.add(car4);



    }
//    Getters

    /**
     *
     * @return
     */
    public Frog getPlayer(){
        return player;
    }

    /**
     *
     * @return
     */
    public ArrayList<Car> getCars(){
        return Cars;
    }

    /**
     *
     * @param keys
     * @param step
     */
    public void movePlayer(int keys,int step){
        //using the keyEvent class in java and move method from the Frog class
        if (keys==KeyEvent.VK_UP){//up key is pressed.
            player.move(0,-step);
        }
        if (keys==KeyEvent.VK_DOWN){//down key is pressed.
            player.move(0,step);
        }
        if (keys==KeyEvent.VK_LEFT){//left key is pressed.
            player.move(-step,0);
        }
        if (keys==KeyEvent.VK_RIGHT){//right key is pressed.
            player.move(step,0);
        }

    }

    /**
     *
     * @param edgeOfTheGameArea
     */
    public void moveCars(int edgeOfTheGameArea){
        for(Car car: Cars){//Accessing all 4 cars using for each loop
            car.move();//calling the move method
            if(car.isMoveLeft()){//if car moves from right to left
                if (car.getCurrentPosition().x<=0){
                    car.getCurrentPosition().translate(-car.getCurrentPosition().x+edgeOfTheGameArea,0);
                }
            }
            else{
                if(car.getCurrentPosition().x>=edgeOfTheGameArea){//if car moves from left to right
                    //moving back the car to zero
                    car.getCurrentPosition().translate(-car.getCurrentPosition().x,0);
                }
            }

        }
    }

    /**
     *
     * @return
     */
    public boolean isPlayerHit(){

        for(Car car:Cars){//Accessing all 4 cars
            if(player.getCurrentPosition().x <= car.getCurrentPosition().x&&player.getCurrentPosition().y<=car.getCurrentPosition().y){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean hasPlayerWon(){
        if(player.getCurrentPosition().y<=20){
            return true;
        }
        else{
            return false;
        }
    }


}