package GameLogic;

import java.awt.*;

public class Frog {
//    Instance variables
    private String name;
    private Point currentPosition;


    /**
     * Returns the bounds of the car object which can be used to detect collision
     * @return A Rectangle object defining the bounds of the frog
     */
//    Constructors

    /**
     *
     * @param name
     * @param pos
     */
    public Frog(String name,Point pos){
        this.name=name;
        this.currentPosition=pos;

    }

    /**
     *
     * @param name
     */
    public Frog(String name){
        this.name = name;
        this.currentPosition = new Point();
    }

    /**
     *
     * @return
     */
//    Instance methods
    public Rectangle getCollisionBounds(){
        return new Rectangle(currentPosition.x,currentPosition.y,30,30);
    }

    /**
     *
     * @return
     */

//  getters:getName() and getCurrentPosition()
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */

    public Point getCurrentPosition() {
        return currentPosition;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public Point move(int x,int y){
        currentPosition.translate(x,y);
        return currentPosition;
    }

    /**
     *
     * @param pt
     * @return
     */
    public double distanceFromPoint(Point pt){
        double distance=pt.distance(currentPosition);
        return distance;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String result=""+"The frog named "+this.name+" is at "+ "("+ currentPosition.x + ","+ currentPosition.y + ")";
        return result;
    }

}