package com.kodilla.patterns.OOP;

public class ShapeDrawer {
        private Shape shape;

        public ShapeDrawer(Shape shape){
            this.shape=shape;
        }

        public void process(){
            System.out.println("start drawing...");
            shape.draw();
        }


}
