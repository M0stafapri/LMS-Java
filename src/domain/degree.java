/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author pc
 */
public class degree {
    int id , m1 , m2 , m3 , m4 , m5 , m6 , sum;

    public void setId(int id) {
        this.id = id;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

    public void setM6(int m6) {
        this.m6 = m6;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public int getM4() {
        return m4;
    }

    public int getM5() {
        return m5;
    }

    public int getM6() {
        return m6;
    }

    public int getSum() {
        return sum;
    }

    public degree(int id, int m1, int m2, int m3, int m4, int m5, int m6, int sum) {
        this.id = id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
        this.sum = sum;
    }
    
    
}
