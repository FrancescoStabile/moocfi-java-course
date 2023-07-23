/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco Stabile
 */
import java.util.ArrayList;

public class BirdsRegister {
    private ArrayList<Bird> birdDatabase;
    private int observations;

    public BirdsRegister() {
        this.birdDatabase = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdDatabase.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birdDatabase) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}