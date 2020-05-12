package com.corson.learning.pattern.template;


/**
 * 模板方法：定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现
 * <p>
 * 模板方法模式中的三类角色
 * 1、具体方法(Concrete Method)
 * 2、抽象方法(Abstract Method)
 * 3、钩子方法(Hook Method)
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-05-07
 */
public abstract class CaffeineBeverageTemplate {
    /**
     * 冲泡方法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    /**
     * 把水煮沸
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 把饮料倒进杯子
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 加调料
     */
    abstract void addCondiments();

    /**
     * 钩子方法
     */
    void hook() {
        System.out.println("有了钩子，子类就能决定要不要覆盖方法。如果子类不提供自己的方法，抽象类会提供一个默认的实现");
    }

    ;

}
