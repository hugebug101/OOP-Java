package org.example;

public class KelasBaru {
//    public static void main(String[] args) {
//        TV tv1 = new TV(); // Create a TV
//        tv1.turnOn(); // Turn on tv1
//        tv1.setChannel(30);
//        tv1.setVolume(3);
//
//        TV tv2 = new TV();
//        tv2.turnOn();
//        tv2.channelUp();
//        tv2.channelUp();
//        tv2.volumeUp(); // Increase tv2 volume up 1 level becomes level 2
//
//        TV tv3 = new TV();
//        tv3.turnOn();
//        tv3.setChannel(55);
//        tv3.setVolume(5);
//        tv3.volumeDown(); // Decrease tv3 volume down 1 level becomes level 4
//        tv3.channelDown(); // Decrease tv3 channel down 1 level becomes level 54
//
//        TV tv4 = new TV(1, 1, true);
//        tv4.channelUp();
//        tv4.volumeUp();
//        tv4.channelUp();
//        tv4.turnOff();
//
//        TV[] tvs = {tv1, tv2, tv3, tv4};
//        for (TV tv : tvs
//        ) {
//            System.out.println("tv's channel is " + tv.channel + " and volume level is " + tv.volumeLevel);
//        }
//
//
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Before creating objects");
//        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);
//
//        // Create c1 and c2
//        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
//        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5.0);
//
//        c2.radius = 9;
//
//        System.out.println("\nAfter creating objects");
//        System.out.println("c1's radius is " + c1.radius);
//        System.out.println("c2's radius is " + c2.radius);
//        System.out.println("Number of objects created: " + CircleWithStaticMembers.numberOfObjects);
//    }

    //    public static void main(String[] args) {
//        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
//        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
//
//        myCircle.setRadius(myCircle.getRadius() * 1.1);
//        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
//
//        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
//    }
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray = TotalArea.createCircleArray(7);
        TotalArea.printCircleArray(circleArray);
    }
}

class TotalArea {
    public static CircleWithPrivateDataFields[] createCircleArray(int numberOfCircles) {
        CircleWithPrivateDataFields[] circles = new CircleWithPrivateDataFields[numberOfCircles];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circles;
    }

    public static void printCircleArray(CircleWithPrivateDataFields[] circles) {
        System.out.printf("%-30s%-15s", "Radius", "Area");
        System.out.println();
        for (CircleWithPrivateDataFields circle : circles
        ) {
            System.out.printf("%-30f%-15f\n", circle.getRadius(), circle.getArea());
        }
    }
}

class CircleWithPrivateDataFields {
    private double radius = 1;

    private static int numberOfObjects = 0;

    CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}

class CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}

class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && (newVolumeLevel >= 1 && newVolumeLevel <= 120))
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
