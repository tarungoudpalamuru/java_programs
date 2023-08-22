package collections;

import exceptionhandling.Primeexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionsExample {
    public static void main(String[] args) throws ClassNotFoundException{
        Class[] objs=java.lang.Thread.class.getClasses();
//        Arrays.stream(objs).forEach(x-> System.out.println(x.getName()));
//        System.out.println();

        Method[] methods= Primeexample.class.getMethods();
        for (Method m:methods) {
            System.out.println(m.getName());
        }
        System.out.println("Pkg :: ");

        Package[] aPackage= Package.getPackages();
//        Annotation[] an=aPackage.getDeclaredAnnotations();
        for (Package annotation : aPackage) {
            System.out.println(annotation.getName());
        }
        for (Method m:methods) {
            System.out.println(m.getName());
        }
    }
}
