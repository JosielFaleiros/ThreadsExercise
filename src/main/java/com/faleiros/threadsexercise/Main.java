/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faleiros.threadsexercise;

/**
 *
 * @author josiel
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleThread());
        thread.start();
    }
}
