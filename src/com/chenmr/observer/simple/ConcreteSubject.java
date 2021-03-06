package com.chenmr.observer.simple;

/**
 * 具体目标
 */
public class ConcreteSubject extends Subject {
    //实现通知方法
    public void advice(){
        //遍历观察者集合，调用每一个观察者的响应方法
        for(Observer obs: observers){
            obs.update();
        }
    }
}
