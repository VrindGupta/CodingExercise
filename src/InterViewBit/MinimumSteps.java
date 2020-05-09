/*
You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to
    (x+1, y),
    (x - 1, y),
    (x, y+1),
    (x, y-1),
    (x-1, y-1),
    (x+1,y+1),
    (x-1,y+1),
    (x+1,y-1)

You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

 */

package InterViewBit;

import java.util.ArrayList;

public class MinimumSteps {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        Integer[] Ax= A.toArray(new Integer[0]);
        Integer[] Bx= B.toArray(new Integer[0]);
        int x= Ax[0];
        int y= Bx[0];
        int steps=0;
        for(int i=1;i<Ax.length;i++){
            while(x!=Ax[i]||y!=Bx[i]){
                if(x==Ax[i]){
                    if(y>Bx[i])
                        steps+=y-Bx[i];
                    else
                        steps+=Bx[i]-y;
                }
                else if(y==Bx[i]){
                    if(x>Ax[i])
                        steps+=x-Ax[i];
                    else
                        steps+=Ax[i]-x;
                }

                else if(((x-y)==(Ax[i]-Bx[i]))||((x+y)==(Ax[i]-Bx[i]))){
                    if(Ax[i]>x)
                        steps+=(Ax[i]-x);
                    else
                        steps+=(x-Ax[i]);
                    x=Ax[i];
                    y=Bx[i];
                }
                else{
                    if(Ax[i]>x){
                        x++;
                        steps++;
                    }
                    else{
                        x--;
                        steps++;
                    }
                }
            }
        }
        return steps;
    }

}
