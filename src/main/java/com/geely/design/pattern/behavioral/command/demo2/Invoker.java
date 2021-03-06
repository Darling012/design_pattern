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
package com.geely.design.pattern.behavioral.command.demo2;

import com.geely.design.pattern.behavioral.command.demo2.absCommand.Command;

/**
* @Package：cn.ucaner.pattern.action.command
* @ClassName：Invoker
* @Description：   <p> 命令模式 ---负责人 </p>
* @Author： -
* @CreatTime：2017年10月26日 下午5:34:36
* @Modify By：
* @ModifyTime：
* @Modify marker：
* @version    V1.0
 */
public class Invoker   {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public  void Call() {
        this.command.execute();
    }
}
