package GameLogic;

import java.awt.*;

public class Car{
//    Instance variables
    private Point currentPosition;
    private Color bodyColour;
    private int movementSpeed;
    private int xSize;
    private int ySize;
    private boolean moveLeft;


    /**
     * Returns the bounds of the car object which can be used to detect collision
     * @return A Rectangle object defining the bounds of the car
     */
//    Constructor

    /**
     *
     * @param pt
     * @param col
     * @param speed
     * @param xsz
     * @param ysz
     * @param mLeft
     */
    public Car(Point pt,Color col,int speed,int xsz,int ysz,boolean mLeft){
        this.currentPosition=pt;
        this.bodyColour=col;
        this.movementSpeed=speed;
        this.xSize=xsz;
        this.ySize=ysz;
        this.moveLeft=mLeft;
    }

    /**
     *
     * @return
     */
//    Getters (except the move() method)-Instance method)
    public Rectangle getCollisionBounds(){
        return new Rectangle(currentPosition.x, currentPosition.y,xSize,ySize);
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
     * @return
     */

    public Color getBodyColour() {
        return bodyColour;
    }

    /**
     *
     * @return
     */

    public int getMovementSpeed() {
        return movementSpeed;
    }

    /**
     *
     * @return
     */

    public int getXSize() {
        return xSize;
    }

    /**
     *
     * @return
     */

    public int getYSize() {
        return ySize;
    }

    /**
     *
     * @return
     */

    public boolean isMoveLeft() {
        return moveLeft;
    }

    /**
     *
     */
    public void move(){
        if(isMoveLeft()){
            currentPosition.x=currentPosition.x-movementSpeed;
        }
        else{
            currentPosition.x=currentPosition.x+movementSpeed;
        }
    }

}