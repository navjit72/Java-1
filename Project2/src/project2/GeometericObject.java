package project2;

import java.util.Date;

public class GeometericObject {
// Declaring all the attributes
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;
// Declaring Sequence Number as Static
    private static int seqNum=0;

    public GeometericObject() {
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
    }
    public GeometericObject(String color, boolean filled){
// Incrementing the sequence Number when the instance is created.
        seqNum+=1;
        this.color=color;
        this.filled=filled; 
        this.dateCreated=new Date();
    }

    public int getSeqNum() {
        return seqNum;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString() {
        return "GeometericObject{" + "color=" + color +
            ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
}
