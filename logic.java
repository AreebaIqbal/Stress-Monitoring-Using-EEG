package com.chris.thinkgearble_androidstudio;

/**
 * Created by Awais on 4/1/2018.
 */

public class logic {
    public int attention,meditation;


        @Override
        public String toString() {
                boolean a = false;
                boolean b = false;
                boolean c = false;
                boolean d = false;
                boolean e = true;


                //  System.out.println("a && b = " + (a&&b));
                //System.out.println("a || b = " + (a||b) );
                //System.out.println("!(a && b) = " + !(a && b));
                    e = attention == 0;
                    a = attention >= 10;
                    b = attention >= 40;
                    c = attention >= 50;
                    d = attention >= 80;

            /* if (e == true && a == false && b == false && c == false && d == false ){
                return "stop";
            }
            if (e == false && a == true && b == false && c == false && d == false ){
                return "Forward";
            }
            if (e == false && a == true && b == true && c == false && d == false ){
                return "Reverse";
            }
            if (e == false && a == true && b == true && c == true && d == false ){
                return "Right";
            }
            if (e == false && a == true && b == true && c == true && d == true ){
                return "Left";
            }*/
            return String.valueOf(attention);  //attention +
                        //"\n" + "\n" + attention + "stop = " + (e = attention == 0) +
                        //"\nForward = " + (a = attention >= 40) +
                        //"\nReverse = " + (b = attention >= 60) +
                        //"\nRight = " + (c = attention >= 80) +
                        //"\nLeft = " + (d = attention >= 100)+
            //"\n" + "\n";
                //attention + "\n" + meditation;


        }
}