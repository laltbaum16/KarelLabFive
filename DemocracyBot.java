
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
                super(st, av, dir, numBeepers);
    }
    public void fixBallots() {
        int beeperCount = 0;
        while(beeperCount != 15) {
            continueOn();
            if(nextToABeeper()) {
                pickBeeper();
                cleanTopRoom();
                beeperCount++;
                cleanBottomRoom();
                beeperCount++;
            }
            continueOn();
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
                turnLeft();
        }
    }
    public void faceEast() {
        while(!facingEast()) {
                turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
                turnLeft();
        }
    }
    public void faceWest() {
        while(!facingWest()) {
                turnLeft();
        }
    }
    public void continueOn() {
        while(!nextToABeeper()) {
                move();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void cleanTopRoom() {
        faceNorth();
        move();
        pickBeeper();
        faceSouth();
        move();
    }
    public void cleanBottomRoom() {
        move();
        pickBeeper();
        faceNorth();
        move();
        turnRight();
    }
}