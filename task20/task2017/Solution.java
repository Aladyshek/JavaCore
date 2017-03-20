package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution implements Serializable {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            if (objectStream.readObject() instanceof B) {
                B a = (B) objectStream.readObject();
                return a;
            } else if (objectStream.readObject() instanceof A) {
                A a = null;

                a = (A) objectStream.readObject();

                return null;
            }
        } catch (Exception e) {
            return null;
        }
        return null;

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}

