/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package com.geely.design.pattern.creational.factory.demo2;

import com.geely.design.pattern.creational.factory.demo2.factory.HumanFactory;
import com.geely.design.pattern.creational.factory.demo2.human.BlackHuman;
import com.geely.design.pattern.creational.factory.demo2.human.WhiteHuman;
import com.geely.design.pattern.creational.factory.demo2.human.YellowHuman;

/**
* @Package：cn.ucaner.pattern.create.factory
* @ClassName：FactoryMain
* @Description：   <p> 工厂模式  - 执行类</p>
* @Author： -
* @CreatTime：2017年10月26日 下午5:47:54
* @Modify By：
* @ModifyTime：
* @Modify marker：
* @version    V1.0
 */
public class FactoryMain {

    public static void main(String[] args) {
        //初始化一个工厂
        AbsHumanFactory humanFactory = new HumanFactory();

        //建造一个黄种人
        Human yellowHuman = humanFactory.createHumen(YellowHuman.class);
        yellowHuman.getColor();

        //建造一个黑人
        Human blackHuman = humanFactory.createHumen(BlackHuman.class);
        blackHuman.getColor();

        //建造一个白人
        Human whiteHuman = humanFactory.createHumen(WhiteHuman.class);
        whiteHuman.getColor();

    }
}
