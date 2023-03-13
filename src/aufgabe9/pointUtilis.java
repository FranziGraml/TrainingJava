package aufgabe9;

public class pointUtilis {





        public static Punkt addPoints(Punkt p1, Punkt p2){

            double sumX = p1.getX()+ p2.getX();
            double sumY= p1.getY() + p2.getY();
            return new Punkt(sumX,sumY);

        }
    }



    /*
    public static Punkt addPoints(Punkt p1, Punkt p2){
        return new Punkt(p1.pointX + p2.pointX,p1.pointY + p2.pointY);
    }
     */