
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot {
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        int beeperCount = 0;
        while(beeperCount != 5) {
            while(nextToABeeper()) {
                pickBeeper();
                beeperCount++; 
            }
            if(beeperCount == 1) {
                faceNorth();
            }
            if(beeperCount == 2) {
                faceEast();
            }
            if(beeperCount == 3) {
                faceSouth();
            }
            if(beeperCount == 4) {
                faceWest();
            }
            if(beeperCount == 5) {
                turnOff();
            }
            beeperCount = 0;
            while(!nextToABeeper()) {
                    move();
            }
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
}