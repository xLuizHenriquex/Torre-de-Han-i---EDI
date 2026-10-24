/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.luiz.atvedidisco;

/**
 *
 * @author lazar
 */

public class Disco {
    static long resolver(int n, char o, char d, char a) {
        return n == 0 ? 0 : resolver(n - 1, o, a, d) + 1 + resolver(n - 1, a, d, o);
    }
}