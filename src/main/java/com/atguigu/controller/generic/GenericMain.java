package com.atguigu.controller.generic;

import javax.validation.constraints.Min;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author: liyinghai
 * @Date: 2021/4/23 22:53
 */
public class GenericMain {
    public static void main(String[] args) {
        ProductGetter<String> productGetter = new ProductGetter<String>();
        String[] strings = new String[]{"笔记本电脑","苹果手机","蓝牙音响"};
        for (String string : strings) {
            productGetter.addProduct(string);
        }
        System.out.println(productGetter.getProduct());

        Integer[] integers = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer integer : integers) {
            arrayList.add(integer);
        }
        Integer product = productGetter.getProduct(arrayList);
        System.out.println(product+"\n"+product.getClass().getSimpleName());

        ProductGetter<Cat> catProductGetter = new ProductGetter<Cat>();
        ArrayList<Cat> cats = new ArrayList<Cat>();
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<MiniCat> miniCats = new ArrayList<MiniCat>();
        //catProductGetter.addList(animals);
        catProductGetter.addList(cats);
        catProductGetter.addList(miniCats);
        System.out.println("------------------------------");

        Class<InfoImpl> infoClass = InfoImpl.class;
        Method[] declaredMethods = infoClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"::"+declaredMethod.getReturnType().getSimpleName());
        }
        System.out.println("------------------------------");
        Class<MiniCat> miniCatClass = MiniCat.class;
        Method[] declaredMethods1 = miniCatClass.getDeclaredMethods();
        for (Method method : declaredMethods1) {
            System.out.println(method.getName()+"::"+method.getReturnType().getSimpleName());
        }

    }
}
